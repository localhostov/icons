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

public val Icons.Outline.UnderConstruction: ImageVector
    get() {
        if (_underConstruction != null) {
            return _underConstruction!!
        }
        _underConstruction = Builder(name = "UnderConstruction", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.535f, 8.458f)
                lineTo(15.538f, 1.462f)
                curveToRelative(-1.952f, -1.952f, -5.128f, -1.952f, -7.08f, 0.0f)
                lineTo(1.462f, 8.458f)
                curveTo(0.517f, 9.403f, -0.004f, 10.661f, -0.004f, 11.998f)
                reflectiveCurveToRelative(0.521f, 2.594f, 1.467f, 3.54f)
                lineToRelative(6.996f, 6.996f)
                curveToRelative(0.976f, 0.976f, 2.258f, 1.464f, 3.54f, 1.464f)
                reflectiveCurveToRelative(2.564f, -0.488f, 3.54f, -1.464f)
                lineToRelative(6.996f, -6.997f)
                curveToRelative(1.952f, -1.952f, 1.952f, -5.128f, 0.0f, -7.08f)
                close()
                moveTo(21.121f, 14.124f)
                lineToRelative(-6.996f, 6.997f)
                curveToRelative(-0.568f, 0.567f, -1.323f, 0.88f, -2.126f, 0.88f)
                reflectiveCurveToRelative(-1.558f, -0.313f, -2.126f, -0.881f)
                lineToRelative(-6.996f, -6.996f)
                curveToRelative(-0.568f, -0.568f, -0.881f, -1.323f, -0.881f, -2.126f)
                reflectiveCurveToRelative(0.313f, -1.558f, 0.881f, -2.126f)
                lineToRelative(6.996f, -6.996f)
                curveToRelative(0.586f, -0.586f, 1.356f, -0.879f, 2.126f, -0.879f)
                reflectiveCurveToRelative(1.54f, 0.293f, 2.126f, 0.879f)
                lineToRelative(6.997f, 6.996f)
                curveToRelative(1.172f, 1.172f, 1.172f, 3.08f, 0.0f, 4.252f)
                close()
                moveTo(16.0f, 14.0f)
                horizontalLineToRelative(-0.209f)
                reflectiveCurveToRelative(-1.836f, -7.703f, -1.863f, -7.762f)
                curveToRelative(-0.349f, -0.764f, -1.088f, -1.238f, -1.928f, -1.238f)
                reflectiveCurveToRelative(-1.579f, 0.475f, -1.928f, 1.238f)
                curveToRelative(-0.027f, 0.059f, -1.863f, 7.762f, -1.863f, 7.762f)
                horizontalLineToRelative(-0.209f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(12.079f, 7.026f)
                lineToRelative(0.706f, 2.974f)
                horizontalLineToRelative(-1.57f)
                lineToRelative(0.706f, -2.974f)
                curveToRelative(0.032f, -0.029f, 0.125f, -0.029f, 0.157f, 0.0f)
                close()
                moveTo(10.266f, 14.0f)
                lineToRelative(0.475f, -2.0f)
                horizontalLineToRelative(2.52f)
                lineToRelative(0.475f, 2.0f)
                horizontalLineToRelative(-3.47f)
                close()
            }
        }
        .build()
        return _underConstruction!!
    }

private var _underConstruction: ImageVector? = null
