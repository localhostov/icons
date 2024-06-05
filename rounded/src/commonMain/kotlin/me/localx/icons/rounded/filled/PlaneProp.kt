package me.localx.icons.rounded.filled

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

public val Icons.Filled.PlaneProp: ImageVector
    get() {
        if (_planeProp != null) {
            return _planeProp!!
        }
        _planeProp = Builder(name = "PlaneProp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.002f, 9.01f)
                lineToRelative(-5.208f, 0.003f)
                lineToRelative(-0.914f, -4.013f)
                horizontalLineToRelative(1.12f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineTo(2.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.467f)
                lineToRelative(-0.347f, -1.242f)
                curveToRelative(-0.171f, -0.797f, -0.744f, -1.489f, -1.534f, -1.689f)
                curveToRelative(-1.395f, -0.353f, -2.651f, 0.699f, -2.651f, 2.038f)
                verticalLineToRelative(0.894f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(4.528f)
                lineToRelative(-1.548f, -2.333f)
                curveToRelative(-0.279f, -0.418f, -0.653f, -0.667f, -1.43f, -0.667f)
                curveToRelative(-0.856f, 0.0f, -1.549f, 0.694f, -1.549f, 1.549f)
                verticalLineToRelative(8.902f)
                curveToRelative(0.0f, 0.856f, 0.694f, 1.549f, 1.549f, 1.549f)
                curveToRelative(0.816f, 0.0f, 1.151f, -0.249f, 1.43f, -0.667f)
                lineToRelative(1.673f, -2.333f)
                horizontalLineToRelative(5.348f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.73f)
                curveToRelative(0.0f, 0.992f, 0.606f, 1.947f, 1.565f, 2.2f)
                curveToRelative(1.194f, 0.314f, 2.356f, -0.456f, 2.6f, -1.594f)
                lineToRelative(0.363f, -1.336f)
                horizontalLineToRelative(1.472f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.12f)
                lineToRelative(0.918f, -4.012f)
                lineToRelative(5.204f, 0.002f)
                curveToRelative(1.654f, 0.004f, 2.998f, -1.336f, 2.998f, -2.99f)
                reflectiveCurveToRelative(-1.343f, -2.995f, -2.998f, -2.99f)
                close()
            }
        }
        .build()
        return _planeProp!!
    }

private var _planeProp: ImageVector? = null
