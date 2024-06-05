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

public val Icons.Bold.CarRear: ImageVector
    get() {
        if (_carRear != null) {
            return _carRear!!
        }
        _carRear = Builder(name = "CarRear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 17.032f)
                curveToRelative(0.0f, -0.345f, -0.03f, -0.688f, -0.045f, -1.032f)
                horizontalLineToRelative(-2.955f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.656f)
                curveToRelative(-0.247f, -1.467f, -0.621f, -2.917f, -1.141f, -4.343f)
                lineToRelative(-2.127f, -5.353f)
                curveToRelative(-0.501f, -1.378f, -1.823f, -2.304f, -3.289f, -2.304f)
                lineTo(6.9f, 1.0f)
                curveToRelative(-1.466f, 0.0f, -2.788f, 0.926f, -3.272f, 2.263f)
                lineToRelative(-2.159f, 5.436f)
                curveToRelative(-0.51f, 1.403f, -0.881f, 2.841f, -1.126f, 4.302f)
                horizontalLineToRelative(2.657f)
                verticalLineToRelative(3.0f)
                lineTo(0.045f, 16.001f)
                curveToRelative(-0.014f, 0.344f, -0.045f, 0.686f, -0.045f, 1.032f)
                verticalLineToRelative(2.968f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.968f)
                close()
                moveTo(4.271f, 9.765f)
                lineToRelative(2.16f, -5.436f)
                curveToRelative(0.071f, -0.196f, 0.26f, -0.329f, 0.469f, -0.329f)
                horizontalLineToRelative(10.199f)
                curveToRelative(0.209f, 0.0f, 0.397f, 0.132f, 0.485f, 0.37f)
                lineToRelative(2.128f, 5.354f)
                curveToRelative(0.153f, 0.421f, 0.285f, 0.848f, 0.406f, 1.276f)
                lineTo(3.878f, 11.0f)
                curveToRelative(0.118f, -0.416f, 0.246f, -0.829f, 0.393f, -1.235f)
                close()
                moveTo(16.0f, 17.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _carRear!!
    }

private var _carRear: ImageVector? = null
