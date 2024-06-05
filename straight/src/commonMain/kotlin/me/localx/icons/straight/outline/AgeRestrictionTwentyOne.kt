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

public val Icons.Outline.AgeRestrictionTwentyOne: ImageVector
    get() {
        if (_ageRestrictionTwentyOne != null) {
            return _ageRestrictionTwentyOne!!
        }
        _ageRestrictionTwentyOne = Builder(name = "AgeRestrictionTwentyOne", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 17.0f)
                lineTo(17.0f, 7.0f)
                horizontalLineToRelative(-1.488f)
                lineToRelative(-2.516f, 2.777f)
                lineToRelative(1.482f, 1.342f)
                lineToRelative(0.521f, -0.575f)
                verticalLineToRelative(6.456f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                curveToRelative(0.0f, 2.5f, -4.0f, 3.49f, -4.0f, 5.75f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.411f)
                curveToRelative(0.863f, -0.789f, 3.411f, -2.428f, 3.411f, -5.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                curveToRelative(3.691f, 0.0f, 6.914f, 2.016f, 8.647f, 5.0f)
                horizontalLineToRelative(2.248f)
                curveTo(20.994f, 2.876f, 16.831f, 0.0f, 12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(4.831f, 0.0f, 8.994f, -2.876f, 10.895f, -7.0f)
                horizontalLineToRelative(-2.248f)
                curveToRelative(-1.732f, 2.984f, -4.955f, 5.0f, -8.647f, 5.0f)
                close()
            }
        }
        .build()
        return _ageRestrictionTwentyOne!!
    }

private var _ageRestrictionTwentyOne: ImageVector? = null
