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

public val Icons.Bold.DownToLine: ImageVector
    get() {
        if (_downToLine != null) {
            return _downToLine!!
        }
        _downToLine = Builder(name = "DownToLine", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                lineTo(24.0f, 21.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(14.35f, 18.02f)
                lineToRelative(9.69f, -10.02f)
                horizontalLineToRelative(-7.04f)
                lineTo(17.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                lineTo(7.0f, 8.0f)
                lineTo(-0.01f, 8.0f)
                lineToRelative(9.67f, 10.01f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.62f, 0.64f, 1.45f, 0.99f, 2.33f, 0.99f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.88f, 0.0f, 1.71f, -0.34f, 2.35f, -0.98f)
                close()
                moveTo(7.05f, 11.0f)
                horizontalLineToRelative(2.95f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 11.0f)
                horizontalLineToRelative(2.96f)
                lineToRelative(-4.75f, 4.91f)
                curveToRelative(-0.07f, 0.07f, -0.15f, 0.09f, -0.21f, 0.09f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.05f, 0.0f, -0.13f, -0.01f, -0.2f, -0.08f)
                lineToRelative(-4.75f, -4.92f)
                close()
            }
        }
        .build()
        return _downToLine!!
    }

private var _downToLine: ImageVector? = null
