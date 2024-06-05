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

public val Icons.Outline.CompassAlt: ImageVector
    get() {
        if (_compassAlt != null) {
            return _compassAlt!!
        }
        _compassAlt = Builder(name = "CompassAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.051f)
                lineTo(13.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.051f)
                curveTo(5.402f, 2.558f, 1.0f, 7.272f, 1.0f, 13.0f)
                curveToRelative(0.0f, 6.065f, 4.935f, 11.0f, 11.0f, 11.0f)
                reflectiveCurveToRelative(11.0f, -4.935f, 11.0f, -11.0f)
                curveToRelative(0.0f, -5.728f, -4.402f, -10.442f, -10.0f, -10.949f)
                close()
                moveTo(13.0f, 21.941f)
                verticalLineToRelative(-0.941f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(0.941f)
                curveToRelative(-4.165f, -0.463f, -7.478f, -3.776f, -7.941f, -7.941f)
                horizontalLineToRelative(0.941f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-0.941f)
                curveToRelative(0.463f, -4.164f, 3.776f, -7.478f, 7.941f, -7.941f)
                verticalLineToRelative(0.941f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-0.941f)
                curveToRelative(4.165f, 0.463f, 7.478f, 3.777f, 7.941f, 7.941f)
                horizontalLineToRelative(-0.941f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.941f)
                curveToRelative(-0.463f, 4.165f, -3.776f, 7.478f, -7.941f, 7.941f)
                close()
                moveTo(15.33f, 11.672f)
                curveToRelative(-0.353f, -0.918f, -1.082f, -1.648f, -2.002f, -2.002f)
                lineToRelative(-5.469f, -2.104f)
                curveToRelative(-0.369f, -0.141f, -0.786f, -0.053f, -1.066f, 0.226f)
                curveToRelative(-0.279f, 0.279f, -0.368f, 0.697f, -0.227f, 1.066f)
                lineToRelative(2.104f, 5.468f)
                curveToRelative(0.354f, 0.92f, 1.083f, 1.649f, 2.002f, 2.003f)
                lineToRelative(5.469f, 2.104f)
                curveToRelative(0.117f, 0.045f, 0.238f, 0.066f, 0.359f, 0.066f)
                curveToRelative(0.261f, 0.0f, 0.516f, -0.102f, 0.707f, -0.293f)
                curveToRelative(0.279f, -0.279f, 0.368f, -0.697f, 0.227f, -1.066f)
                lineToRelative(-2.104f, -5.468f)
                close()
                moveTo(11.39f, 14.463f)
                curveToRelative(-0.392f, -0.15f, -0.702f, -0.461f, -0.853f, -0.854f)
                lineToRelative(-1.296f, -3.368f)
                lineToRelative(3.368f, 1.295f)
                curveToRelative(0.393f, 0.151f, 0.703f, 0.462f, 0.854f, 0.853f)
                lineToRelative(1.296f, 3.369f)
                lineToRelative(-3.369f, -1.296f)
                close()
            }
        }
        .build()
        return _compassAlt!!
    }

private var _compassAlt: ImageVector? = null
