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

public val Icons.Bold.CloudBackUp: ImageVector
    get() {
        if (_cloudBackUp != null) {
            return _cloudBackUp!!
        }
        _cloudBackUp = Builder(name = "CloudBackUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 20.0f)
                horizontalLineToRelative(2.559f)
                lineToRelative(-3.159f, 3.583f)
                curveToRelative(-0.48f, 0.556f, -1.32f, 0.556f, -1.8f, 0.0f)
                lineToRelative(-3.159f, -3.583f)
                horizontalLineToRelative(2.559f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(18.633f, 4.968f)
                curveTo(17.189f, 1.966f, 14.116f, 0.0f, 10.75f, 0.0f)
                curveTo(5.925f, 0.0f, 2.0f, 3.925f, 2.0f, 8.75f)
                curveToRelative(0.0f, 0.341f, 0.021f, 0.688f, 0.065f, 1.038f)
                curveToRelative(-1.279f, 1.129f, -2.065f, 2.771f, -2.065f, 4.417f)
                curveToRelative(0.0f, 3.196f, 2.386f, 5.796f, 5.318f, 5.796f)
                horizontalLineToRelative(0.682f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-0.682f)
                curveToRelative(-1.278f, 0.0f, -2.318f, -1.254f, -2.318f, -2.796f)
                curveToRelative(0.0f, -0.948f, 0.597f, -1.948f, 1.484f, -2.488f)
                lineToRelative(0.933f, -0.567f)
                lineToRelative(-0.253f, -1.062f)
                curveToRelative(-0.11f, -0.465f, -0.164f, -0.902f, -0.164f, -1.337f)
                curveToRelative(0.0f, -3.17f, 2.579f, -5.75f, 5.75f, -5.75f)
                curveToRelative(2.388f, 0.0f, 4.552f, 1.508f, 5.385f, 3.753f)
                lineToRelative(0.29f, 0.78f)
                lineToRelative(0.815f, 0.167f)
                curveToRelative(2.179f, 0.446f, 3.76f, 2.378f, 3.76f, 4.594f)
                curveToRelative(0.0f, 1.083f, -0.383f, 2.069f, -1.0f, 2.865f)
                verticalLineToRelative(3.887f)
                curveToRelative(2.382f, -1.312f, 4.0f, -3.846f, 4.0f, -6.752f)
                curveToRelative(0.0f, -3.36f, -2.214f, -6.322f, -5.367f, -7.327f)
                close()
                moveTo(13.559f, 15.0f)
                lineToRelative(-3.113f, -3.531f)
                curveToRelative(-0.473f, -0.548f, -1.3f, -0.548f, -1.774f, 0.0f)
                lineToRelative(-3.113f, 3.531f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(2.5f)
                close()
            }
        }
        .build()
        return _cloudBackUp!!
    }

private var _cloudBackUp: ImageVector? = null
