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

public val Icons.Filled.AgeRestrictionTwentyOne: ImageVector
    get() {
        if (_ageRestrictionTwentyOne != null) {
            return _ageRestrictionTwentyOne!!
        }
        _ageRestrictionTwentyOne = Builder(name = "AgeRestrictionTwentyOne", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(10.0f, 15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.25f)
                curveToRelative(0.0f, -2.26f, 4.0f, -3.25f, 4.0f, -5.75f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                curveToRelative(0.0f, 2.572f, -2.548f, 4.212f, -3.411f, 5.0f)
                horizontalLineToRelative(3.411f)
                close()
                moveTo(15.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.456f)
                lineToRelative(-0.521f, 0.575f)
                lineToRelative(-1.482f, -1.342f)
                lineToRelative(2.516f, -2.777f)
                horizontalLineToRelative(1.488f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(20.0f, 13.0f)
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
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _ageRestrictionTwentyOne!!
    }

private var _ageRestrictionTwentyOne: ImageVector? = null
