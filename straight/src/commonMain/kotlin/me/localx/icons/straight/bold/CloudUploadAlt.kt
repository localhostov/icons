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

public val Icons.Bold.CloudUploadAlt: ImageVector
    get() {
        if (_cloudUploadAlt != null) {
            return _cloudUploadAlt!!
        }
        _cloudUploadAlt = Builder(name = "CloudUploadAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.633f, 6.968f)
                curveToRelative(-1.443f, -3.001f, -4.517f, -4.968f, -7.883f, -4.968f)
                curveTo(5.925f, 2.0f, 2.0f, 5.925f, 2.0f, 10.75f)
                curveToRelative(0.0f, 0.342f, 0.022f, 0.688f, 0.065f, 1.037f)
                curveToRelative(-1.278f, 1.13f, -2.065f, 2.771f, -2.065f, 4.417f)
                curveToRelative(0.0f, 3.196f, 2.386f, 5.796f, 5.318f, 5.796f)
                horizontalLineToRelative(10.978f)
                curveToRelative(4.248f, 0.0f, 7.704f, -3.456f, 7.704f, -7.705f)
                curveToRelative(0.0f, -3.359f, -2.214f, -6.321f, -5.367f, -7.327f)
                close()
                moveTo(16.296f, 19.0f)
                lineTo(5.318f, 19.0f)
                curveToRelative(-1.278f, 0.0f, -2.318f, -1.254f, -2.318f, -2.796f)
                curveToRelative(0.0f, -0.948f, 0.596f, -1.948f, 1.484f, -2.488f)
                lineToRelative(0.933f, -0.566f)
                lineToRelative(-0.253f, -1.062f)
                curveToRelative(-0.108f, -0.456f, -0.164f, -0.906f, -0.164f, -1.337f)
                curveToRelative(0.0f, -3.171f, 2.58f, -5.75f, 5.75f, -5.75f)
                curveToRelative(2.388f, 0.0f, 4.552f, 1.509f, 5.385f, 3.753f)
                lineToRelative(0.29f, 0.781f)
                lineToRelative(0.815f, 0.167f)
                curveToRelative(2.179f, 0.446f, 3.76f, 2.378f, 3.76f, 4.594f)
                curveToRelative(0.0f, 2.595f, -2.11f, 4.705f, -4.704f, 4.705f)
                close()
                moveTo(15.559f, 13.0f)
                horizontalLineToRelative(-2.559f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.559f)
                lineToRelative(3.159f, -3.583f)
                curveToRelative(0.48f, -0.556f, 1.32f, -0.556f, 1.8f, 0.0f)
                lineToRelative(3.159f, 3.583f)
                close()
            }
        }
        .build()
        return _cloudUploadAlt!!
    }

private var _cloudUploadAlt: ImageVector? = null
