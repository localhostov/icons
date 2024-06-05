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

public val Icons.Outline.Escalator: ImageVector
    get() {
        if (_escalator != null) {
            return _escalator!!
        }
        _escalator = Builder(name = "Escalator", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(24.0f, 8.952f)
                curveToRelative(0.0f, 2.159f, -1.594f, 3.865f, -3.617f, 4.034f)
                lineToRelative(-11.339f, 9.594f)
                curveToRelative(-1.082f, 0.916f, -2.458f, 1.42f, -3.875f, 1.42f)
                horizontalLineToRelative(-1.218f)
                curveToRelative(-2.179f, 0.0f, -3.951f, -1.773f, -3.951f, -3.952f)
                curveToRelative(0.0f, -2.159f, 1.594f, -3.865f, 3.617f, -4.034f)
                lineToRelative(1.383f, -1.17f)
                verticalLineToRelative(-5.344f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(1.745f, 0.0f, 3.196f, 1.284f, 3.458f, 2.957f)
                lineToRelative(2.998f, -2.537f)
                curveToRelative(1.082f, -0.916f, 2.458f, -1.42f, 3.875f, -1.42f)
                horizontalLineToRelative(1.218f)
                curveToRelative(2.179f, 0.0f, 3.951f, 1.773f, 3.951f, 3.952f)
                close()
                moveTo(7.0f, 13.152f)
                lineToRelative(3.0f, -2.538f)
                verticalLineToRelative(-1.113f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(3.652f)
                close()
                moveTo(22.0f, 9.048f)
                curveToRelative(0.0f, -1.173f, -0.875f, -2.048f, -1.951f, -2.048f)
                horizontalLineToRelative(-1.218f)
                curveToRelative(-0.944f, 0.0f, -1.862f, 0.336f, -2.584f, 0.947f)
                lineToRelative(-11.602f, 9.816f)
                curveToRelative(-0.18f, 0.153f, -0.409f, 0.237f, -0.646f, 0.237f)
                curveToRelative(-1.125f, 0.0f, -2.0f, 0.875f, -2.0f, 1.952f)
                curveToRelative(0.0f, 1.173f, 0.875f, 2.048f, 1.951f, 2.048f)
                horizontalLineToRelative(1.218f)
                curveToRelative(0.944f, 0.0f, 1.862f, -0.336f, 2.584f, -0.947f)
                lineToRelative(11.602f, -9.816f)
                curveToRelative(0.18f, -0.153f, 0.409f, -0.237f, 0.646f, -0.237f)
                curveToRelative(1.125f, 0.0f, 2.0f, -0.875f, 2.0f, -1.952f)
                close()
            }
        }
        .build()
        return _escalator!!
    }

private var _escalator: ImageVector? = null
