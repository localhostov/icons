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
                moveToRelative(22.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                curveToRelative(-4.055f, 0.0f, -7.794f, -2.058f, -9.995f, -5.368f)
                lineToRelative(-0.005f, 2.368f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(-3.991f)
                curveToRelative(0.0f, -1.107f, 0.901f, -2.009f, 2.008f, -2.009f)
                horizontalLineToRelative(3.992f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.637f)
                curveToRelative(1.776f, 3.06f, 5.052f, 5.0f, 8.637f, 5.0f)
                curveToRelative(5.514f, 0.0f, 10.0f, -4.486f, 10.0f, -10.0f)
                close()
                moveTo(22.0f, 3.0f)
                lineToRelative(-0.005f, 2.355f)
                curveTo(19.806f, 2.04f, 16.106f, 0.0f, 12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                curveTo(2.0f, 6.486f, 6.486f, 2.0f, 12.0f, 2.0f)
                curveToRelative(3.64f, 0.0f, 6.9f, 1.921f, 8.665f, 5.0f)
                horizontalLineToRelative(-2.665f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.992f)
                curveToRelative(1.107f, 0.0f, 2.008f, -0.901f, 2.008f, -2.009f)
                verticalLineToRelative(-3.991f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(10.0f, 10.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(4.469f)
                lineToRelative(2.314f, 1.874f)
                curveToRelative(0.135f, 0.086f, 0.281f, 0.126f, 0.424f, 0.126f)
                curveToRelative(0.411f, 0.0f, 0.791f, -0.327f, 0.792f, -0.791f)
                lineToRelative(0.002f, -6.709f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                close()
                moveTo(13.5f, 5.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                lineToRelative(0.002f, 7.209f)
                curveToRelative(0.0f, 0.463f, 0.381f, 0.791f, 0.792f, 0.791f)
                curveToRelative(0.142f, 0.0f, 0.288f, -0.039f, 0.424f, -0.126f)
                lineToRelative(0.783f, -0.634f)
                verticalLineToRelative(-3.24f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _feedbackCycleLoop!!
    }

private var _feedbackCycleLoop: ImageVector? = null
