package me.localx.icons.straight.outline

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

public val Icons.Outline.ShekelSign: ImageVector
    get() {
        if (_shekelSign != null) {
            return _shekelSign!!
        }
        _shekelSign = Builder(name = "ShekelSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 24.0f)
                lineTo(2.0f, 24.0f)
                lineTo(2.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(4.411f, 0.0f, 8.0f, 3.589f, 8.0f, 8.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(14.0f, 8.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                lineTo(4.0f, 2.0f)
                lineTo(4.0f, 24.0f)
                close()
                moveTo(22.0f, 16.0f)
                lineTo(22.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(20.0f, 16.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(8.0f, 24.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(4.411f, 0.0f, 8.0f, -3.589f, 8.0f, -8.0f)
                close()
            }
        }
        .build()
        return _shekelSign!!
    }

private var _shekelSign: ImageVector? = null
