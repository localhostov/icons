package me.localx.icons.straight.filled

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

public val Icons.Filled.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.042f, -0.048f)
                lineTo(24.0f, 1.04f)
                curveToRelative(-0.021f, 0.551f, -0.583f, 13.568f, -5.071f, 18.056f)
                arcToRelative(9.929f, 9.929f, 0.0f, false, true, -13.281f, 0.671f)
                lineToRelative(11.06f, -11.06f)
                lineTo(15.293f, 7.293f)
                lineTo(4.233f, 18.353f)
                arcTo(9.931f, 9.931f, 0.0f, false, true, 4.9f, 5.072f)
                curveTo(9.3f, 0.672f, 22.4f, 0.026f, 22.955f, 0.0f)
                close()
                moveTo(4.233f, 18.353f)
                lineToRelative(-4.19f, 4.19f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(4.19f, -4.19f)
                arcTo(9.946f, 9.946f, 0.0f, false, true, 4.233f, 18.353f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
