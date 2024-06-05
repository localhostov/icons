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

public val Icons.Outline.UtilityPole: ImageVector
    get() {
        if (_utilityPole != null) {
            return _utilityPole!!
        }
        _utilityPole = Builder(name = "UtilityPole", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 0.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveTo(0.0f, 0.448f, 0.0f, 1.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(2.086f)
                lineToRelative(6.414f, 6.414f)
                verticalLineToRelative(12.586f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-12.586f)
                lineToRelative(6.414f, -6.414f)
                horizontalLineToRelative(2.086f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(7.414f, 4.0f)
                horizontalLineToRelative(3.586f)
                verticalLineToRelative(3.586f)
                lineToRelative(-3.586f, -3.586f)
                close()
                moveTo(13.0f, 4.0f)
                horizontalLineToRelative(3.586f)
                lineToRelative(-3.586f, 3.586f)
                verticalLineToRelative(-3.586f)
                close()
            }
        }
        .build()
        return _utilityPole!!
    }

private var _utilityPole: ImageVector? = null
