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

public val Icons.Filled.Api: ImageVector
    get() {
        if (_api != null) {
            return _api!!
        }
        _api = Builder(name = "Api", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, -0.54f, -0.05f, -1.08f, -0.15f, -1.63f)
                lineToRelative(3.05f, -1.75f)
                lineToRelative(-2.99f, -5.2f)
                lineToRelative(-3.05f, 1.75f)
                curveToRelative(-0.84f, -0.72f, -1.81f, -1.28f, -2.86f, -1.65f)
                lineTo(15.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(9.0f, 3.52f)
                curveToRelative(-1.05f, 0.37f, -2.02f, 0.93f, -2.86f, 1.65f)
                lineToRelative(-3.05f, -1.75f)
                lineTo(0.1f, 8.62f)
                lineToRelative(3.05f, 1.75f)
                curveToRelative(-0.1f, 0.54f, -0.15f, 1.09f, -0.15f, 1.63f)
                reflectiveCurveToRelative(0.05f, 1.08f, 0.15f, 1.63f)
                lineTo(0.1f, 15.38f)
                lineToRelative(2.99f, 5.2f)
                lineToRelative(3.05f, -1.75f)
                curveToRelative(0.84f, 0.72f, 1.81f, 1.28f, 2.86f, 1.65f)
                verticalLineToRelative(3.52f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.52f)
                curveToRelative(1.05f, -0.37f, 2.02f, -0.93f, 2.86f, -1.65f)
                lineToRelative(3.05f, 1.75f)
                lineToRelative(2.99f, -5.2f)
                lineToRelative(-3.05f, -1.75f)
                curveToRelative(0.1f, -0.54f, 0.15f, -1.09f, 0.15f, -1.63f)
                close()
                moveTo(9.71f, 13.75f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.71f, -1.71f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.04f, 0.0f, -2.81f)
                lineToRelative(1.71f, -1.71f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.71f, 1.71f)
                lineToRelative(1.71f, 1.69f)
                close()
                moveTo(11.98f, 17.2f)
                lineToRelative(-1.96f, -0.39f)
                lineToRelative(2.0f, -10.0f)
                lineToRelative(1.96f, 0.39f)
                lineToRelative(-2.0f, 10.0f)
                close()
                moveTo(17.42f, 13.45f)
                lineToRelative(-1.71f, 1.71f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.71f, -1.71f)
                lineToRelative(-1.71f, -1.7f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.71f, 1.71f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.04f, 0.0f, 2.81f)
                close()
            }
        }
        .build()
        return _api!!
    }

private var _api: ImageVector? = null
