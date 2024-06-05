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

public val Icons.Outline.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 7.0f)
                close()
                moveTo(14.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 9.0f)
                close()
                moveTo(11.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 12.0f)
                close()
                moveTo(23.866f, 2.958f)
                lineToRelative(-0.075f, 0.211f)
                curveTo(22.289f, 7.337f, 20.848f, 11.3f, 18.0f, 14.82f)
                lineTo(18.0f, 15.0f)
                arcToRelative(11.02f, 11.02f, 0.0f, false, true, -3.6f, 8.135f)
                arcToRelative(3.264f, 3.264f, 0.0f, false, true, -2.2f, 0.865f)
                arcTo(3.21f, 3.21f, 0.0f, false, true, 9.0f, 20.794f)
                lineTo(9.0f, 19.643f)
                arcToRelative(4.951f, 4.951f, 0.0f, false, true, -1.961f, -1.191f)
                lineTo(7.0f, 18.414f)
                lineTo(4.707f, 20.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineTo(5.586f, 17.0f)
                lineToRelative(-0.039f, -0.038f)
                arcTo(4.98f, 4.98f, 0.0f, false, true, 4.353f, 15.0f)
                horizontalLineToRelative(-0.99f)
                arcTo(3.366f, 3.366f, 0.0f, false, true, 0.0f, 11.638f)
                arcTo(3.4f, 3.4f, 0.0f, false, true, 0.938f, 9.3f)
                arcTo(10.922f, 10.922f, 0.0f, false, true, 9.0f, 6.0f)
                horizontalLineToRelative(0.18f)
                curveTo(12.7f, 3.153f, 16.66f, 1.712f, 20.826f, 0.211f)
                lineToRelative(0.216f, -0.077f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 2.824f, 2.824f)
                close()
                moveTo(3.363f, 13.0f)
                lineTo(4.1f, 13.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.891f, -2.45f)
                arcTo(25.362f, 25.362f, 0.0f, false, true, 6.8f, 8.244f)
                arcToRelative(8.507f, 8.507f, 0.0f, false, false, -4.4f, 2.426f)
                arcTo(1.407f, 1.407f, 0.0f, false, false, 2.0f, 11.638f)
                arcTo(1.364f, 1.364f, 0.0f, false, false, 3.363f, 13.0f)
                close()
                moveTo(15.7f, 17.252f)
                arcToRelative(25.552f, 25.552f, 0.0f, false, true, -2.252f, 1.759f)
                arcTo(4.983f, 4.983f, 0.0f, false, true, 11.0f, 19.887f)
                verticalLineToRelative(0.907f)
                arcTo(1.208f, 1.208f, 0.0f, false, false, 12.207f, 22.0f)
                arcToRelative(1.271f, 1.271f, 0.0f, false, false, 0.852f, -0.345f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 15.7f, 17.252f)
                close()
                moveTo(21.937f, 2.063f)
                arcToRelative(0.191f, 0.191f, 0.0f, false, false, -0.217f, -0.048f)
                lineToRelative(-0.215f, 0.078f)
                curveTo(16.661f, 3.838f, 12.478f, 5.346f, 8.876f, 8.947f)
                arcTo(20.867f, 20.867f, 0.0f, false, false, 6.628f, 11.7f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.333f, 3.851f)
                lineToRelative(1.492f, 1.49f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.849f, 0.334f)
                arcToRelative(20.817f, 20.817f, 0.0f, false, false, 2.751f, -2.248f)
                curveToRelative(3.6f, -3.6f, 5.11f, -7.787f, 6.856f, -12.633f)
                lineToRelative(0.076f, -0.211f)
                arcTo(0.192f, 0.192f, 0.0f, false, false, 21.937f, 2.063f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
