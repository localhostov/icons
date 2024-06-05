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

public val Icons.Bold.Airplay: ImageVector
    get() {
        if (_airplay != null) {
            return _airplay!!
        }
        _airplay = Builder(name = "Airplay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 4.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(-2.961f)
                lineToRelative(-2.458f, -3.0f)
                horizontalLineToRelative(2.418f)
                lineTo(20.999f, 4.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 4.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(2.419f)
                lineToRelative(-2.458f, 3.0f)
                lineTo(0.0f, 19.0f)
                lineTo(0.0f, 4.5f)
                curveTo(0.0f, 2.57f, 1.57f, 1.0f, 3.5f, 1.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(14.497f, 14.169f)
                lineToRelative(7.233f, 8.831f)
                lineTo(2.27f, 23.0f)
                lineToRelative(7.226f, -8.82f)
                curveToRelative(0.627f, -0.753f, 1.537f, -1.18f, 2.504f, -1.18f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.967f, 0.0f, 1.877f, 0.426f, 2.497f, 1.169f)
                close()
                moveTo(15.394f, 20.0f)
                lineToRelative(-3.21f, -3.92f)
                curveToRelative(-0.107f, -0.128f, -0.251f, -0.14f, -0.376f, 0.01f)
                lineToRelative(-3.203f, 3.91f)
                horizontalLineToRelative(6.789f)
                close()
            }
        }
        .build()
        return _airplay!!
    }

private var _airplay: ImageVector? = null
