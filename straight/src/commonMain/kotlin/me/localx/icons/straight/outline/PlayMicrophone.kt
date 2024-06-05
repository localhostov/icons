package me.localx.icons.straight.outline

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

public val Icons.Outline.PlayMicrophone: ImageVector
    get() {
        if (_playMicrophone != null) {
            return _playMicrophone!!
        }
        _playMicrophone = Builder(name = "PlayMicrophone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.526f, 16.166f)
                lineToRelative(-1.803f, -1.014f)
                curveToRelative(0.172f, -0.701f, 0.277f, -1.421f, 0.277f, -2.152f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.081f, -0.167f, 2.145f, -0.474f, 3.166f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(2.967f, 0.0f, 5.431f, 2.167f, 5.91f, 5.0f)
                horizontalLineToRelative(-3.91f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.66f)
                lineToRelative(5.381f, 3.026f)
                curveToRelative(0.172f, -0.657f, 0.279f, -1.333f, 0.279f, -2.026f)
                verticalLineToRelative(-4.0f)
                curveTo(20.0f, 3.589f, 16.411f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(4.0f, 3.589f, 4.0f, 8.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 4.411f, 3.589f, 8.0f, 8.0f, 8.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-2.967f, 0.0f, -5.431f, -2.167f, -5.91f, -5.0f)
                horizontalLineToRelative(3.91f)
                verticalLineToRelative(-2.0f)
                lineTo(6.0f, 11.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.91f)
                curveToRelative(0.478f, -2.833f, 2.942f, -5.0f, 5.91f, -5.0f)
                close()
                moveTo(2.0f, 13.0f)
                lineTo(0.0f, 13.0f)
                curveToRelative(0.0f, 6.065f, 4.935f, 11.0f, 11.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                close()
                moveTo(14.0f, 13.104f)
                lineToRelative(9.708f, 5.459f)
                lineToRelative(-9.708f, 5.459f)
                lineTo(14.0f, 13.104f)
                close()
                moveTo(16.0f, 20.604f)
                lineToRelative(3.628f, -2.041f)
                lineToRelative(-3.628f, -2.041f)
                verticalLineToRelative(4.081f)
                close()
            }
        }
        .build()
        return _playMicrophone!!
    }

private var _playMicrophone: ImageVector? = null
