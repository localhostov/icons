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

public val Icons.Outline.CloudRainbow: ImageVector
    get() {
        if (_cloudRainbow != null) {
            return _cloudRainbow!!
        }
        _cloudRainbow = Builder(name = "CloudRainbow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 24.0f)
                lineTo(4.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.962f, -7.883f)
                arcTo(5.109f, 5.109f, 0.0f, false, true, 3.0f, 15.5f)
                arcToRelative(5.488f, 5.488f, 0.0f, false, true, 10.787f, -1.438f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 13.0f, 24.0f)
                close()
                moveTo(4.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.062f, -6.0f)
                lineToRelative(-1.007f, 0.0f)
                lineToRelative(-0.1f, -0.89f)
                arcTo(3.488f, 3.488f, 0.0f, false, false, 5.0f, 15.5f)
                arcToRelative(3.433f, 3.433f, 0.0f, false, false, 0.218f, 1.164f)
                lineTo(5.694f, 18.0f)
                close()
                moveTo(19.375f, 16.133f)
                arcTo(6.111f, 6.111f, 0.0f, false, true, 24.0f, 14.0f)
                lineTo(24.0f, 12.0f)
                arcToRelative(8.114f, 8.114f, 0.0f, false, false, -5.741f, 2.392f)
                arcTo(6.914f, 6.914f, 0.0f, false, true, 19.375f, 16.133f)
                close()
                moveTo(15.083f, 11.981f)
                curveToRelative(0.072f, 0.136f, 0.156f, 0.264f, 0.221f, 0.4f)
                arcToRelative(6.923f, 6.923f, 0.0f, false, true, 1.471f, 0.734f)
                arcTo(10.015f, 10.015f, 0.0f, false, true, 24.0f, 10.0f)
                lineTo(24.0f, 8.0f)
                arcTo(12.034f, 12.034f, 0.0f, false, false, 15.083f, 11.981f)
                close()
                moveTo(7.983f, 8.025f)
                curveTo(8.157f, 8.013f, 8.327f, 8.0f, 8.5f, 8.0f)
                arcToRelative(7.413f, 7.413f, 0.0f, false, true, 1.866f, 0.253f)
                arcTo(17.983f, 17.983f, 0.0f, false, true, 24.0f, 2.0f)
                lineTo(24.0f, 0.0f)
                arcTo(19.979f, 19.979f, 0.0f, false, false, 7.986f, 8.025f)
                close()
                moveTo(12.31f, 9.068f)
                arcToRelative(7.475f, 7.475f, 0.0f, false, true, 1.57f, 1.254f)
                arcTo(13.928f, 13.928f, 0.0f, false, true, 24.0f, 6.0f)
                lineTo(24.0f, 4.0f)
                arcTo(15.912f, 15.912f, 0.0f, false, false, 12.313f, 9.068f)
                close()
            }
        }
        .build()
        return _cloudRainbow!!
    }

private var _cloudRainbow: ImageVector? = null
