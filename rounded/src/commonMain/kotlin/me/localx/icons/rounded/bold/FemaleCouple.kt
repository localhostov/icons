package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.FemaleCouple: ImageVector
    get() {
        if (_femaleCouple != null) {
            return _femaleCouple!!
        }
        _femaleCouple = Builder(name = "FemaleCouple", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 7.5f)
                arcTo(7.485f, 7.485f, 0.0f, false, false, 12.005f, 1.511f)
                arcTo(7.5f, 7.5f, 0.0f, true, false, 6.0f, 14.849f)
                lineTo(6.0f, 18.0f)
                lineTo(5.0f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(9.0f, 21.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                lineTo(9.0f, 18.0f)
                lineTo(9.0f, 14.847f)
                arcToRelative(7.437f, 7.437f, 0.0f, false, false, 3.005f, -1.358f)
                arcTo(7.451f, 7.451f, 0.0f, false, false, 15.0f, 14.849f)
                lineTo(15.0f, 18.0f)
                lineTo(14.0f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(18.0f, 21.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                lineTo(18.0f, 18.0f)
                lineTo(18.0f, 14.849f)
                arcTo(7.513f, 7.513f, 0.0f, false, false, 24.0f, 7.5f)
                close()
                moveTo(3.0f, 7.5f)
                arcToRelative(4.492f, 4.492f, 0.0f, false, true, 7.0f, -3.732f)
                arcToRelative(7.438f, 7.438f, 0.0f, false, false, 0.0f, 7.464f)
                arcTo(4.492f, 4.492f, 0.0f, false, true, 3.0f, 7.5f)
                close()
                moveTo(12.0f, 7.5f)
                arcTo(4.5f, 4.5f, 0.0f, true, true, 16.5f, 12.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 12.0f, 7.5f)
                close()
            }
        }
        .build()
        return _femaleCouple!!
    }

private var _femaleCouple: ImageVector? = null
