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

public val Icons.Outline.Cupcake: ImageVector
    get() {
        if (_cupcake != null) {
            return _cupcake!!
        }
        _cupcake = Builder(name = "Cupcake", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 14.0f)
                curveToRelative(0.0f, -4.736f, -3.976f, -8.706f, -9.29f, -9.733f)
                arcToRelative(2.994f, 2.994f, 0.0f, true, false, -5.419f, 0.0f)
                curveTo(3.976f, 5.294f, 0.0f, 9.264f, 0.0f, 14.0f)
                arcToRelative(2.946f, 2.946f, 0.0f, false, false, 2.142f, 2.887f)
                lineToRelative(0.826f, 4.638f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.921f, 24.0f)
                lineTo(18.08f, 24.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.953f, -2.475f)
                lineToRelative(0.825f, -4.638f)
                arcTo(2.946f, 2.946f, 0.0f, false, false, 24.0f, 14.0f)
                close()
                moveTo(11.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 3.0f)
                close()
                moveTo(18.08f, 22.0f)
                lineTo(5.921f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.984f, -0.824f)
                lineToRelative(-0.664f, -3.731f)
                arcTo(2.993f, 2.993f, 0.0f, false, false, 8.0f, 17.22f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, 4.0f, 0.0f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, 4.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.728f, 0.225f)
                lineToRelative(-0.664f, 3.73f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.08f, 22.0f)
                close()
                moveTo(21.0f, 15.0f)
                lineTo(19.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(15.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(11.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(7.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(3.0f, 15.0f)
                arcToRelative(0.915f, 0.915f, 0.0f, false, true, -1.0f, -1.0f)
                curveToRelative(0.506f, -10.6f, 19.492f, -10.591f, 20.0f, -0.012f)
                arcTo(0.918f, 0.918f, 0.0f, false, true, 21.0f, 15.0f)
                close()
            }
        }
        .build()
        return _cupcake!!
    }

private var _cupcake: ImageVector? = null
