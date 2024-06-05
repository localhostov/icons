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

public val Icons.Outline.Butterfly: ImageVector
    get() {
        if (_butterfly != null) {
            return _butterfly!!
        }
        _butterfly = Builder(name = "Butterfly", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.793f, 15.0f)
                curveToRelative(0.032f, 0.0f, -0.031f, 0.0f, 0.0f, 0.0f)
                close()
                moveTo(21.193f, 13.565f)
                curveToRelative(3.279f, 3.235f, 1.3f, 8.32f, -0.257f, 9.949f)
                lineToRelative(-0.4f, 0.46f)
                lineToRelative(-0.592f, -0.149f)
                arcTo(15.359f, 15.359f, 0.0f, false, true, 13.0f, 19.676f)
                verticalLineToRelative(2.343f)
                lineTo(11.0f, 22.019f)
                lineTo(11.0f, 19.676f)
                arcToRelative(15.359f, 15.359f, 0.0f, false, true, -6.94f, 4.153f)
                lineToRelative(-0.592f, 0.149f)
                lineToRelative(-0.4f, -0.46f)
                curveToRelative(-1.585f, -1.733f, -3.526f, -6.5f, -0.2f, -9.905f)
                arcToRelative(6.939f, 6.939f, 0.0f, false, true, -2.855f, -5.3f)
                arcTo(12.315f, 12.315f, 0.0f, false, true, 1.385f, 2.489f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.16f, 1.239f)
                arcTo(21.222f, 21.222f, 0.0f, false, true, 12.0f, 6.568f)
                arcToRelative(21.222f, 21.222f, 0.0f, false, true, 6.84f, -5.329f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.774f, 1.249f)
                arcToRelative(12.311f, 12.311f, 0.0f, false, true, 1.38f, 5.827f)
                arcTo(6.9f, 6.9f, 0.0f, false, true, 21.191f, 13.569f)
                close()
                moveTo(11.0f, 14.3f)
                arcToRelative(9.823f, 9.823f, 0.0f, false, true, -3.794f, 0.7f)
                arcTo(7.006f, 7.006f, 0.0f, false, true, 4.7f, 14.6f)
                curveToRelative(-2.4f, 2.04f, -1.873f, 5.185f, -0.5f, 7.106f)
                curveTo(7.508f, 20.619f, 11.0f, 17.567f, 11.0f, 15.643f)
                close()
                moveTo(11.0f, 8.477f)
                arcTo(19.958f, 19.958f, 0.0f, false, false, 4.388f, 3.087f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.264f, 0.391f)
                arcTo(10.433f, 10.433f, 0.0f, false, false, 2.0f, 8.239f)
                arcTo(5.13f, 5.13f, 0.0f, false, false, 7.179f, 13.0f)
                arcTo(6.3f, 6.3f, 0.0f, false, false, 11.0f, 11.989f)
                close()
                moveTo(21.0f, 18.009f)
                arcToRelative(4.559f, 4.559f, 0.0f, false, false, -1.668f, -3.437f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, -2.54f, 0.43f)
                arcTo(9.821f, 9.821f, 0.0f, false, true, 13.0f, 14.3f)
                verticalLineToRelative(1.341f)
                curveToRelative(0.0f, 1.924f, 3.492f, 4.976f, 6.792f, 6.059f)
                arcTo(6.931f, 6.931f, 0.0f, false, false, 21.0f, 18.011f)
                close()
                moveTo(22.0f, 8.239f)
                arcToRelative(10.419f, 10.419f, 0.0f, false, false, -1.121f, -4.761f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.263f, -0.391f)
                arcTo(19.958f, 19.958f, 0.0f, false, false, 13.0f, 8.479f)
                verticalLineToRelative(3.51f)
                arcTo(6.3f, 6.3f, 0.0f, false, false, 16.82f, 13.0f)
                arcTo(5.066f, 5.066f, 0.0f, false, false, 22.0f, 8.239f)
                close()
                moveTo(12.0f, 3.985f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, -0.022f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 3.985f)
                close()
            }
        }
        .build()
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
