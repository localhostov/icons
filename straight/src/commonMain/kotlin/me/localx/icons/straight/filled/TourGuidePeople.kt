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

public val Icons.Filled.TourGuidePeople: ImageVector
    get() {
        if (_tourGuidePeople != null) {
            return _tourGuidePeople!!
        }
        _tourGuidePeople = Builder(name = "TourGuidePeople", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(14.0f, 0.0f)
                lineToRelative(4.0f, 2.5f)
                lineToRelative(-4.0f, 2.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -1.618f, 1.311f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(9.0f)
                lineTo(12.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(15.0f, 14.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(18.0f, 17.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                close()
                moveTo(23.5f, 7.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                close()
                moveTo(21.5f, 11.0f)
                horizontalLineToRelative(-2.028f)
                curveToRelative(0.018f, 0.164f, 0.028f, 0.331f, 0.028f, 0.5f)
                curveToRelative(0.0f, 1.022f, -0.343f, 1.966f, -0.919f, 2.723f)
                curveToRelative(0.873f, 0.821f, 1.419f, 1.987f, 1.419f, 3.277f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _tourGuidePeople!!
    }

private var _tourGuidePeople: ImageVector? = null
