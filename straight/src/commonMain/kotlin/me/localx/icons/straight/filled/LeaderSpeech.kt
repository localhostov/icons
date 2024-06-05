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

public val Icons.Filled.LeaderSpeech: ImageVector
    get() {
        if (_leaderSpeech != null) {
            return _leaderSpeech!!
        }
        _leaderSpeech = Builder(name = "LeaderSpeech", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(11.0f, 14.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-6.018f)
                lineToRelative(5.675f, -6.721f)
                lineTo(22.103f, 0.026f)
                lineToRelative(-5.088f, 5.974f)
                horizontalLineToRelative(-5.028f)
                lineTo(7.0f, 0.0f)
                lineToRelative(-1.572f, 1.235f)
                lineToRelative(5.572f, 6.747f)
                verticalLineToRelative(6.018f)
                close()
                moveTo(24.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                lineTo(2.0f, 24.0f)
                verticalLineToRelative(-6.0f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.914f)
                lineToRelative(1.574f, -1.574f)
                curveToRelative(-0.044f, -0.164f, -0.074f, -0.334f, -0.074f, -0.512f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                curveToRelative(-0.178f, 0.0f, -0.347f, -0.031f, -0.512f, -0.074f)
                lineToRelative(-0.988f, 0.988f)
                verticalLineToRelative(3.086f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _leaderSpeech!!
    }

private var _leaderSpeech: ImageVector? = null
