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

public val Icons.Bold.CarBolt: ImageVector
    get() {
        if (_carBolt != null) {
            return _carBolt!!
        }
        _carBolt = Builder(name = "CarBolt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 17.032f)
                curveToRelative(0.0f, -2.852f, -0.494f, -5.656f, -1.484f, -8.375f)
                lineToRelative(-2.127f, -5.353f)
                curveToRelative(-0.501f, -1.378f, -1.823f, -2.304f, -3.289f, -2.304f)
                horizontalLineToRelative(-0.814f)
                lineToRelative(3.427f, 8.724f)
                curveToRelative(0.153f, 0.421f, 0.285f, 0.848f, 0.406f, 1.276f)
                lineTo(3.878f, 11.0f)
                curveToRelative(0.118f, -0.416f, 0.246f, -0.829f, 0.393f, -1.235f)
                lineTo(7.794f, 1.0f)
                horizontalLineToRelative(-0.894f)
                curveToRelative(-1.466f, 0.0f, -2.788f, 0.926f, -3.272f, 2.263f)
                lineTo(1.469f, 8.698f)
                curveToRelative(-0.975f, 2.678f, -1.469f, 5.481f, -1.469f, 8.333f)
                verticalLineToRelative(2.968f)
                lineTo(3.0f, 19.999f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 22.999f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.968f)
                close()
                moveTo(17.0f, 14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(7.0f, 17.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(12.681f, 10.425f)
                lineToRelative(-2.362f, -1.85f)
                lineToRelative(1.233f, -1.575f)
                horizontalLineToRelative(-0.937f)
                curveToRelative(-0.667f, 0.0f, -1.301f, -0.32f, -1.699f, -0.855f)
                curveToRelative(-0.397f, -0.535f, -0.519f, -1.235f, -0.325f, -1.873f)
                lineTo(11.252f, 0.167f)
                lineToRelative(2.495f, 1.665f)
                lineToRelative(-1.446f, 2.167f)
                horizontalLineToRelative(1.094f)
                curveToRelative(0.776f, 0.0f, 1.487f, 0.425f, 1.854f, 1.109f)
                curveToRelative(0.367f, 0.684f, 0.329f, 1.511f, -0.101f, 2.157f)
                lineToRelative(-2.467f, 3.158f)
                close()
            }
        }
        .build()
        return _carBolt!!
    }

private var _carBolt: ImageVector? = null
