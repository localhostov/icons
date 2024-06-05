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

public val Icons.Outline.BoltSlash: ImageVector
    get() {
        if (_boltSlash != null) {
            return _boltSlash!!
        }
        _boltSlash = Builder(name = "BoltSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.084f, 15.67f)
                lineToRelative(2.551f, -3.847f)
                curveToRelative(0.502f, -0.757f, 0.548f, -1.725f, 0.119f, -2.525f)
                curveToRelative(-0.43f, -0.801f, -1.261f, -1.298f, -2.17f, -1.298f)
                horizontalLineToRelative(-3.801f)
                lineTo(15.806f, 0.0f)
                horizontalLineToRelative(-3.321f)
                lineToRelative(-4.415f, 6.656f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-6.873f, -6.873f)
                close()
                moveTo(17.584f, 10.0f)
                curveToRelative(0.241f, 0.0f, 0.358f, 0.152f, 0.407f, 0.244f)
                curveToRelative(0.049f, 0.091f, 0.111f, 0.273f, -0.022f, 0.474f)
                lineToRelative(-2.327f, 3.509f)
                lineToRelative(-4.227f, -4.227f)
                horizontalLineToRelative(6.169f)
                close()
                moveTo(13.04f, 2.782f)
                lineToRelative(-1.785f, 7.058f)
                lineToRelative(-1.741f, -1.741f)
                lineToRelative(3.526f, -5.317f)
                close()
                moveTo(13.386f, 17.627f)
                lineToRelative(1.443f, 1.443f)
                lineToRelative(-3.27f, 4.929f)
                horizontalLineToRelative(-3.321f)
                lineToRelative(2.023f, -8.0f)
                horizontalLineToRelative(-3.774f)
                curveToRelative(-0.917f, 0.0f, -1.757f, -0.503f, -2.191f, -1.313f)
                curveToRelative(-0.428f, -0.798f, -0.385f, -1.76f, 0.113f, -2.51f)
                lineToRelative(1.406f, -2.12f)
                lineToRelative(1.443f, 1.443f)
                lineToRelative(-1.182f, 1.782f)
                curveToRelative(-0.127f, 0.191f, -0.065f, 0.369f, -0.018f, 0.459f)
                curveToRelative(0.042f, 0.077f, 0.167f, 0.259f, 0.429f, 0.259f)
                horizontalLineToRelative(3.271f)
                lineToRelative(2.452f, 2.452f)
                lineToRelative(-1.205f, 4.766f)
                lineToRelative(2.381f, -3.59f)
                close()
            }
        }
        .build()
        return _boltSlash!!
    }

private var _boltSlash: ImageVector? = null
