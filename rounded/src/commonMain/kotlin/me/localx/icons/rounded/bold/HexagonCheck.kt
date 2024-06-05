package me.localx.icons.rounded.bold

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

public val Icons.Bold.HexagonCheck: ImageVector
    get() {
        if (_hexagonCheck != null) {
            return _hexagonCheck!!
        }
        _hexagonCheck = Builder(name = "HexagonCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.582f, 8.461f)
                curveToRelative(0.573f, 0.597f, 0.555f, 1.547f, -0.043f, 2.121f)
                lineToRelative(-4.605f, 4.424f)
                curveToRelative(-0.668f, 0.659f, -1.552f, 0.989f, -2.439f, 0.989f)
                reflectiveCurveToRelative(-1.774f, -0.33f, -2.451f, -0.992f)
                lineToRelative(-1.546f, -1.387f)
                curveToRelative(-0.616f, -0.554f, -0.667f, -1.502f, -0.113f, -2.118f)
                curveToRelative(0.554f, -0.616f, 1.502f, -0.667f, 2.118f, -0.113f)
                lineToRelative(1.592f, 1.43f)
                curveToRelative(0.24f, 0.232f, 0.555f, 0.231f, 0.747f, 0.042f)
                lineToRelative(4.62f, -4.438f)
                curveToRelative(0.597f, -0.575f, 1.546f, -0.555f, 2.121f, 0.042f)
                close()
                moveTo(23.245f, 14.78f)
                lineToRelative(-3.224f, 5.5f)
                curveToRelative(-0.982f, 1.677f, -2.801f, 2.719f, -4.745f, 2.719f)
                horizontalLineToRelative(-6.551f)
                curveToRelative(-1.944f, 0.0f, -3.762f, -1.042f, -4.745f, -2.719f)
                lineTo(0.757f, 14.781f)
                curveToRelative(-1.005f, -1.715f, -1.005f, -3.846f, 0.0f, -5.562f)
                lineTo(3.981f, 3.719f)
                curveToRelative(0.982f, -1.677f, 2.801f, -2.719f, 4.745f, -2.719f)
                horizontalLineToRelative(6.551f)
                curveToRelative(1.944f, 0.0f, 3.763f, 1.042f, 4.745f, 2.719f)
                lineToRelative(3.224f, 5.5f)
                curveToRelative(1.005f, 1.715f, 1.005f, 3.846f, 0.0f, 5.561f)
                close()
                moveTo(20.657f, 10.735f)
                lineToRelative(-3.224f, -5.5f)
                curveToRelative(-0.447f, -0.762f, -1.273f, -1.236f, -2.157f, -1.236f)
                horizontalLineToRelative(-6.551f)
                curveToRelative(-0.883f, 0.0f, -1.71f, 0.474f, -2.156f, 1.236f)
                lineToRelative(-3.224f, 5.5f)
                curveToRelative(-0.457f, 0.78f, -0.457f, 1.749f, 0.0f, 2.528f)
                lineToRelative(3.224f, 5.5f)
                curveToRelative(0.447f, 0.762f, 1.273f, 1.236f, 2.157f, 1.236f)
                horizontalLineToRelative(6.551f)
                curveToRelative(0.884f, 0.0f, 1.71f, -0.474f, 2.157f, -1.236f)
                lineToRelative(3.224f, -5.5f)
                curveToRelative(0.456f, -0.78f, 0.456f, -1.749f, 0.0f, -2.529f)
                close()
            }
        }
        .build()
        return _hexagonCheck!!
    }

private var _hexagonCheck: ImageVector? = null
