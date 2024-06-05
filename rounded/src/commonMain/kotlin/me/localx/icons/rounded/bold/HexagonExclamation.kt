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

public val Icons.Bold.HexagonExclamation: ImageVector
    get() {
        if (_hexagonExclamation != null) {
            return _hexagonExclamation!!
        }
        _hexagonExclamation = Builder(name = "HexagonExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.229f, 9.219f)
                lineToRelative(-3.223f, -5.5f)
                curveToRelative(-0.983f, -1.677f, -2.802f, -2.719f, -4.745f, -2.719f)
                horizontalLineToRelative(-6.551f)
                curveToRelative(-1.944f, 0.0f, -3.762f, 1.042f, -4.745f, 2.719f)
                lineTo(0.742f, 9.219f)
                curveToRelative(-1.005f, 1.716f, -1.005f, 3.847f, 0.0f, 5.562f)
                lineToRelative(3.223f, 5.5f)
                curveToRelative(0.983f, 1.677f, 2.801f, 2.719f, 4.745f, 2.719f)
                horizontalLineToRelative(6.551f)
                curveToRelative(1.943f, 0.0f, 3.762f, -1.042f, 4.745f, -2.719f)
                lineToRelative(3.223f, -5.5f)
                curveToRelative(1.005f, -1.716f, 1.005f, -3.847f, 0.0f, -5.562f)
                close()
                moveTo(20.641f, 13.264f)
                lineToRelative(-3.223f, 5.5f)
                curveToRelative(-0.447f, 0.763f, -1.274f, 1.236f, -2.157f, 1.236f)
                horizontalLineToRelative(-6.551f)
                curveToRelative(-0.884f, 0.0f, -1.71f, -0.474f, -2.157f, -1.236f)
                lineToRelative(-3.223f, -5.5f)
                curveToRelative(-0.457f, -0.779f, -0.457f, -1.748f, 0.0f, -2.527f)
                lineToRelative(3.223f, -5.5f)
                curveToRelative(0.447f, -0.763f, 1.273f, -1.236f, 2.157f, -1.236f)
                horizontalLineToRelative(6.551f)
                curveToRelative(0.883f, 0.0f, 1.71f, 0.474f, 2.157f, 1.236f)
                lineToRelative(3.223f, 5.5f)
                curveToRelative(0.457f, 0.779f, 0.457f, 1.748f, 0.0f, 2.527f)
                close()
                moveTo(13.499f, 7.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(13.499f, 16.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _hexagonExclamation!!
    }

private var _hexagonExclamation: ImageVector? = null
