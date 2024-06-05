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

public val Icons.Filled.FeedbackCycleLoop: ImageVector
    get() {
        if (_feedbackCycleLoop != null) {
            return _feedbackCycleLoop!!
        }
        _feedbackCycleLoop = Builder(name = "FeedbackCycleLoop", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 11.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.469f)
                lineToRelative(2.314f, 1.874f)
                curveToRelative(0.135f, 0.086f, 0.281f, 0.126f, 0.424f, 0.126f)
                curveToRelative(0.411f, 0.0f, 0.791f, -0.327f, 0.792f, -0.791f)
                lineToRelative(0.002f, -6.209f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.001f, -2.0f, -2.001f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                close()
                moveTo(13.0f, 5.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.896f, -2.0f, 2.0f)
                lineToRelative(0.002f, 6.709f)
                curveToRelative(0.0f, 0.463f, 0.381f, 0.791f, 0.792f, 0.791f)
                curveToRelative(0.142f, 0.0f, 0.288f, -0.039f, 0.424f, -0.126f)
                lineToRelative(0.783f, -0.634f)
                verticalLineToRelative(-2.74f)
                curveToRelative(0.0f, -2.209f, 1.791f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                curveToRelative(-4.055f, 0.0f, -7.795f, -2.059f, -9.996f, -5.37f)
                lineToRelative(-0.004f, 1.37f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-2.991f)
                curveToRelative(0.0f, -1.107f, 0.901f, -2.009f, 2.008f, -2.009f)
                horizontalLineToRelative(2.992f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.637f)
                curveToRelative(1.776f, 3.06f, 5.052f, 5.0f, 8.637f, 5.0f)
                curveToRelative(5.514f, 0.0f, 10.0f, -4.486f, 10.0f, -10.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(23.0f, 3.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                lineToRelative(-0.004f, 1.355f)
                curveTo(19.807f, 2.04f, 16.107f, 0.0f, 12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                curveTo(2.0f, 6.486f, 6.486f, 2.0f, 12.0f, 2.0f)
                curveToRelative(3.64f, 0.0f, 6.9f, 1.921f, 8.666f, 5.0f)
                horizontalLineToRelative(-1.666f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.991f)
                curveToRelative(1.107f, 0.0f, 2.009f, -0.901f, 2.009f, -2.009f)
                verticalLineToRelative(-2.991f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _feedbackCycleLoop!!
    }

private var _feedbackCycleLoop: ImageVector? = null
