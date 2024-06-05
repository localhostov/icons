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

public val Icons.Bold.SignHanging: ImageVector
    get() {
        if (_signHanging != null) {
            return _signHanging!!
        }
        _signHanging = Builder(name = "SignHanging", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 3.0f)
                lineTo(24.0f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                lineTo(0.0f, 24.0f)
                lineTo(3.0f, 24.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(2.036f)
                curveToRelative(-1.694f, 0.243f, -3.0f, 1.704f, -3.0f, 3.464f)
                verticalLineToRelative(12.5f)
                lineTo(24.0f, 21.0f)
                lineTo(24.0f, 8.5f)
                curveToRelative(0.0f, -1.76f, -1.306f, -3.221f, -3.0f, -3.464f)
                lineTo(21.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(21.0f, 18.0f)
                lineTo(8.0f, 18.0f)
                lineTo(8.0f, 8.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(9.5f)
                close()
                moveTo(18.0f, 5.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _signHanging!!
    }

private var _signHanging: ImageVector? = null
