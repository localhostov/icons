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

public val Icons.Outline.Bike: ImageVector
    get() {
        if (_bike != null) {
            return _bike!!
        }
        _bike = Builder(name = "Bike", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.79f, 12.08f)
                curveToRelative(-0.77f, -2.868f, -1.923f, -6.013f, -2.5f, -7.534f)
                arcToRelative(14.144f, 14.144f, 0.0f, false, true, 1.5f, -0.514f)
                arcToRelative(0.931f, 0.931f, 0.0f, false, true, 0.81f, 0.169f)
                arcToRelative(1.015f, 1.015f, 0.0f, false, true, 0.4f, 0.81f)
                horizontalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.181f, -2.395f)
                arcTo(2.913f, 2.913f, 0.0f, false, false, 18.276f, 2.1f)
                arcToRelative(21.03f, 21.03f, 0.0f, false, false, -2.687f, 0.989f)
                lineToRelative(-0.873f, 0.393f)
                lineToRelative(0.355f, 0.89f)
                curveToRelative(0.01f, 0.025f, 0.506f, 1.269f, 1.121f, 2.991f)
                lineTo(12.02f, 10.607f)
                lineTo(8.414f, 7.0f)
                lineTo(10.0f, 7.0f)
                lineTo(10.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                lineTo(4.0f, 7.0f)
                lineTo(5.586f, 7.0f)
                lineToRelative(4.843f, 4.844f)
                lineTo(8.442f, 13.39f)
                arcToRelative(4.958f, 4.958f, 0.0f, true, false, 1.15f, 1.639f)
                lineTo(16.88f, 9.36f)
                curveToRelative(0.3f, 0.919f, 0.6f, 1.881f, 0.866f, 2.819f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 2.044f, -0.1f)
                close()
                moveTo(5.0f, 20.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 20.0f)
                close()
                moveTo(19.0f, 20.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 20.0f)
                close()
            }
        }
        .build()
        return _bike!!
    }

private var _bike: ImageVector? = null
