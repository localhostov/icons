package me.localx.icons.rounded.filled

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

public val Icons.Filled.CrossCircle: ImageVector
    get() {
        if (_crossCircle != null) {
            return _crossCircle!!
        }
        _crossCircle = Builder(name = "CrossCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                curveTo(114.615f, 0.0f, 0.0f, 114.615f, 0.0f, 256.0f)
                reflectiveCurveToRelative(114.615f, 256.0f, 256.0f, 256.0f)
                reflectiveCurveToRelative(256.0f, -114.615f, 256.0f, -256.0f)
                curveTo(511.847f, 114.678f, 397.322f, 0.153f, 256.0f, 0.0f)
                close()
                moveTo(341.333f, 311.189f)
                curveToRelative(8.669f, 7.979f, 9.229f, 21.475f, 1.25f, 30.144f)
                curveToRelative(-7.979f, 8.669f, -21.475f, 9.229f, -30.144f, 1.25f)
                curveToRelative(-0.434f, -0.399f, -0.85f, -0.816f, -1.25f, -1.25f)
                lineTo(256.0f, 286.165f)
                lineToRelative(-55.168f, 55.168f)
                curveToRelative(-8.475f, 8.185f, -21.98f, 7.95f, -30.165f, -0.525f)
                curveToRelative(-7.984f, -8.267f, -7.984f, -21.373f, 0.0f, -29.64f)
                lineTo(225.835f, 256.0f)
                lineToRelative(-55.168f, -55.168f)
                curveToRelative(-8.185f, -8.475f, -7.95f, -21.98f, 0.525f, -30.165f)
                curveToRelative(8.267f, -7.984f, 21.373f, -7.984f, 29.64f, 0.0f)
                lineTo(256.0f, 225.835f)
                lineToRelative(55.189f, -55.168f)
                curveToRelative(7.979f, -8.669f, 21.475f, -9.229f, 30.144f, -1.25f)
                curveToRelative(8.669f, 7.979f, 9.229f, 21.475f, 1.25f, 30.144f)
                curveToRelative(-0.399f, 0.434f, -0.816f, 0.85f, -1.25f, 1.25f)
                lineTo(286.165f, 256.0f)
                lineTo(341.333f, 311.189f)
                close()
            }
        }
        .build()
        return _crossCircle!!
    }

private var _crossCircle: ImageVector? = null
