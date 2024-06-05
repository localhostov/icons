package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.HelicopterSide: ImageVector
    get() {
        if (_helicopterSide != null) {
            return _helicopterSide!!
        }
        _helicopterSide = Builder(name = "HelicopterSide", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.0f)
                lineTo(24.0f, 1.0f)
                lineTo(17.0f, 1.0f)
                lineTo(17.0f, 0.0f)
                lineTo(14.0f, 0.0f)
                lineTo(14.0f, 1.0f)
                lineTo(7.0f, 1.0f)
                lineTo(7.0f, 4.0f)
                horizontalLineToRelative(7.0f)
                lineTo(14.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                lineTo(3.0f, 4.0f)
                lineTo(0.0f, 4.0f)
                verticalLineToRelative(7.131f)
                lineToRelative(7.031f, 2.01f)
                arcTo(6.512f, 6.512f, 0.0f, false, false, 11.0f, 18.5f)
                lineTo(11.0f, 21.0f)
                lineTo(7.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(20.5f, 24.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 24.0f, 20.5f)
                lineTo(24.0f, 20.0f)
                lineTo(21.0f, 20.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(19.0f, 21.0f)
                lineTo(19.0f, 19.0f)
                horizontalLineToRelative(0.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 24.0f, 14.5f)
                arcToRelative(8.507f, 8.507f, 0.0f, false, false, -7.0f, -8.359f)
                lineTo(17.0f, 4.0f)
                close()
                moveTo(16.0f, 21.0f)
                lineTo(14.0f, 21.0f)
                lineTo(14.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(19.5f, 16.0f)
                horizontalLineToRelative(-6.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 10.0f, 12.5f)
                lineTo(10.0f, 10.869f)
                lineTo(3.46f, 9.0f)
                lineTo(14.0f, 9.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(6.975f)
                curveToRelative(0.014f, 0.163f, 0.025f, 0.328f, 0.025f, 0.495f)
                arcTo(1.505f, 1.505f, 0.0f, false, true, 19.5f, 16.0f)
                close()
            }
        }
        .build()
        return _helicopterSide!!
    }

private var _helicopterSide: ImageVector? = null
