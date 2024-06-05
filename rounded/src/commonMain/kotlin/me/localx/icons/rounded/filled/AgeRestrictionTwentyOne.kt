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
                moveTo(12.0f, 0.0f)
                curveTo(5.4f, 0.0f, 0.0f, 5.4f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.4f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.4f, 12.0f, -12.0f)
                reflectiveCurveTo(18.6f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(15.0f, 16.0f)
                curveToRelative(0.0f, 0.6f, -0.4f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.4f, -1.0f, -1.0f)
                verticalLineToRelative(-5.9f)
                lineToRelative(-0.5f, 0.6f)
                curveToRelative(-0.4f, 0.4f, -1.0f, 0.4f, -1.4f, 0.1f)
                reflectiveCurveToRelative(-0.4f, -1.0f, -0.1f, -1.4f)
                lineToRelative(1.7f, -1.9f)
                curveToRelative(0.4f, -0.4f, 0.9f, -0.5f, 1.4f, -0.3f)
                curveTo(14.7f, 7.3f, 15.0f, 7.8f, 15.0f, 8.3f)
                verticalLineTo(16.0f)
                close()
                moveTo(9.0f, 15.0f)
                curveToRelative(0.6f, 0.0f, 1.0f, 0.4f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.4f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-0.6f, 0.0f, -1.0f, -0.4f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.4f, 1.0f, -2.3f, 2.0f, -3.1f)
                curveTo(7.0f, 12.0f, 8.0f, 11.2f, 8.0f, 10.0f)
                curveToRelative(0.0f, -0.6f, -0.4f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.4f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-0.4f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.4f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.7f, 1.3f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.3f, 3.0f, 3.0f)
                curveToRelative(0.0f, 2.1f, -1.5f, 3.4f, -2.6f, 4.4f)
                curveToRelative(-0.2f, 0.2f, -0.5f, 0.4f, -0.7f, 0.6f)
                horizontalLineTo(9.0f)
                close()
                moveTo(21.0f, 13.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.6f, -0.4f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.4f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.6f, 0.0f, -1.0f, -0.4f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.4f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.6f, 0.4f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.4f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.6f, 0.0f, 1.0f, 0.4f, 1.0f, 1.0f)
                reflectiveCurveTo(21.6f, 13.0f, 21.0f, 13.0f)
                close()
            }
        }
        .build()
        return _ageRestrictionTwentyOne!!
    }

private var _ageRestrictionTwentyOne: ImageVector? = null
