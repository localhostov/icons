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

public val Icons.Outline.Peach: ImageVector
    get() {
        if (_peach != null) {
            return _peach!!
        }
        _peach = Builder(name = "Peach", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.333f, 5.047f)
                arcTo(6.669f, 6.669f, 0.0f, false, false, 22.0f, 1.543f)
                lineToRelative(0.068f, -0.69f)
                lineTo(21.441f, 0.547f)
                arcTo(6.816f, 6.816f, 0.0f, false, false, 18.591f, 0.0f)
                arcToRelative(7.358f, 7.358f, 0.0f, false, false, -6.139f, 3.168f)
                arcTo(4.6f, 4.6f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(2.0f)
                curveToRelative(1.909f, 0.0f, 2.6f, 1.614f, 2.855f, 2.794f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 0.0f, 11.5f)
                curveTo(0.0f, 18.6f, 8.0f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(12.0f, -5.4f, 12.0f, -12.5f)
                arcTo(7.463f, 7.463f, 0.0f, false, false, 20.333f, 5.047f)
                close()
                moveTo(18.591f, 2.0f)
                arcToRelative(6.156f, 6.156f, 0.0f, false, true, 1.211f, 0.118f)
                arcToRelative(4.823f, 4.823f, 0.0f, false, true, -1.494f, 2.1f)
                arcToRelative(7.32f, 7.32f, 0.0f, false, true, -4.93f, 1.327f)
                arcTo(5.6f, 5.6f, 0.0f, false, true, 18.591f, 2.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(9.018f, 22.0f, 2.0f, 17.566f, 2.0f, 11.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 8.821f, -4.381f)
                arcTo(5.336f, 5.336f, 0.0f, false, true, 13.0f, 11.5f)
                arcToRelative(12.252f, 12.252f, 0.0f, false, true, -1.833f, 5.946f)
                lineToRelative(1.665f, 1.109f)
                arcTo(14.128f, 14.128f, 0.0f, false, false, 15.0f, 11.5f)
                arcToRelative(7.454f, 7.454f, 0.0f, false, false, -1.127f, -3.95f)
                arcToRelative(9.6f, 9.6f, 0.0f, false, false, 4.741f, -1.13f)
                arcTo(5.472f, 5.472f, 0.0f, false, true, 22.0f, 11.5f)
                curveTo(22.0f, 17.566f, 14.982f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _peach!!
    }

private var _peach: ImageVector? = null
