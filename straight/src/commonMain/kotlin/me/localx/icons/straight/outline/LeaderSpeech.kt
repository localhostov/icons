package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.LeaderSpeech: ImageVector
    get() {
        if (_leaderSpeech != null) {
            return _leaderSpeech!!
        }
        _leaderSpeech = Builder(name = "LeaderSpeech", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 2.5f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 16.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(19.0f, 7.362f)
                lineToRelative(4.768f, -5.722f)
                lineToRelative(-1.536f, -1.28f)
                lineToRelative(-4.7f, 5.64f)
                horizontalLineToRelative(-6.063f)
                lineTo(6.768f, 0.36f)
                lineToRelative(-1.536f, 1.28f)
                lineToRelative(4.768f, 5.722f)
                verticalLineToRelative(8.638f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-3.086f)
                lineToRelative(0.989f, -0.989f)
                curveToRelative(0.164f, 0.044f, 0.333f, 0.074f, 0.511f, 0.074f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.178f, 0.031f, 0.348f, 0.074f, 0.512f)
                lineToRelative(-1.574f, 1.574f)
                verticalLineToRelative(3.914f)
                lineTo(0.0f, 15.999f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 8.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _leaderSpeech!!
    }

private var _leaderSpeech: ImageVector? = null
