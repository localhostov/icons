package me.localx.icons.rounded.outline

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

public val Icons.Outline.Scalpel: ImageVector
    get() {
        if (_scalpel != null) {
            return _scalpel!!
        }
        _scalpel = Builder(name = "Scalpel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.121f, 1.879f)
                curveToRelative(-1.17f, -1.17f, -3.072f, -1.17f, -4.242f, 0.0f)
                lineTo(0.293f, 20.465f)
                curveToRelative(-0.15f, 0.15f, -0.249f, 0.345f, -0.281f, 0.555f)
                curveToRelative(-0.058f, 0.371f, 0.015f, 0.922f, 0.388f, 1.357f)
                curveToRelative(0.243f, 0.284f, 0.706f, 0.623f, 1.523f, 0.623f)
                curveToRelative(0.474f, 0.0f, 0.88f, 0.009f, 1.116f, 0.0f)
                curveToRelative(1.8f, -0.071f, 3.553f, -0.479f, 5.209f, -1.211f)
                curveToRelative(2.591f, -1.146f, 4.37f, -3.201f, 5.161f, -5.955f)
                lineToRelative(9.712f, -9.712f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.072f, 0.0f, -4.242f)
                close()
                moveTo(7.439f, 19.959f)
                curveToRelative(-1.425f, 0.63f, -2.932f, 0.98f, -4.479f, 1.042f)
                curveToRelative(-0.191f, 0.008f, -0.339f, 0.008f, -0.381f, 0.006f)
                lineToRelative(7.033f, -7.033f)
                lineToRelative(1.769f, 1.65f)
                curveToRelative(-0.669f, 2.016f, -1.992f, 3.473f, -3.941f, 4.335f)
                close()
                moveTo(21.707f, 4.707f)
                lineToRelative(-9.217f, 9.216f)
                lineToRelative(-1.463f, -1.364f)
                lineTo(20.293f, 3.293f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.39f, 1.024f, 0.0f, 1.414f)
                close()
            }
        }
        .build()
        return _scalpel!!
    }

private var _scalpel: ImageVector? = null
