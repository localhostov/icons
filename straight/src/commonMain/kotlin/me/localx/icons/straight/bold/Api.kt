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

public val Icons.Bold.Api: ImageVector
    get() {
        if (_api != null) {
            return _api!!
        }
        _api = Builder(name = "Api", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.02f, 6.8f)
                lineToRelative(1.96f, 0.39f)
                lineToRelative(-2.0f, 10.0f)
                lineToRelative(-1.96f, -0.39f)
                lineToRelative(2.0f, -10.0f)
                close()
                moveTo(8.29f, 8.92f)
                lineToRelative(-1.71f, 1.71f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.04f, 0.0f, 2.81f)
                lineToRelative(1.71f, 1.71f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.71f, -1.69f)
                lineToRelative(1.71f, -1.71f)
                lineToRelative(-1.41f, -1.41f)
                close()
                moveTo(17.42f, 10.63f)
                lineToRelative(-1.71f, -1.71f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.71f, 1.7f)
                lineToRelative(-1.71f, 1.71f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.71f, -1.71f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.04f, 0.0f, -2.81f)
                close()
                moveTo(21.31f, 15.63f)
                lineToRelative(1.84f, 1.06f)
                lineToRelative(-1.5f, 2.6f)
                lineToRelative(-1.84f, -1.06f)
                curveToRelative(-1.54f, 1.92f, -3.76f, 3.25f, -6.3f, 3.64f)
                verticalLineToRelative(2.12f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.12f)
                curveToRelative(-2.54f, -0.38f, -4.77f, -1.72f, -6.3f, -3.64f)
                lineToRelative(-1.84f, 1.06f)
                lineToRelative(-1.5f, -2.6f)
                lineToRelative(1.84f, -1.06f)
                curveToRelative(-0.44f, -1.13f, -0.7f, -2.35f, -0.7f, -3.64f)
                reflectiveCurveToRelative(0.25f, -2.51f, 0.7f, -3.64f)
                lineToRelative(-1.84f, -1.06f)
                lineToRelative(1.5f, -2.6f)
                lineToRelative(1.84f, 1.06f)
                curveToRelative(1.54f, -1.92f, 3.76f, -3.25f, 6.3f, -3.64f)
                lineTo(10.51f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.51f, 2.12f)
                curveToRelative(2.54f, 0.38f, 4.77f, 1.72f, 6.3f, 3.64f)
                lineToRelative(1.84f, -1.06f)
                lineToRelative(1.5f, 2.6f)
                lineToRelative(-1.84f, 1.06f)
                curveToRelative(0.44f, 1.13f, 0.7f, 2.35f, 0.7f, 3.64f)
                reflectiveCurveToRelative(-0.25f, 2.51f, -0.7f, 3.64f)
                close()
                moveTo(19.01f, 11.99f)
                curveToRelative(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveToRelative(-7.0f, 3.14f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f)
                close()
            }
        }
        .build()
        return _api!!
    }

private var _api: ImageVector? = null
