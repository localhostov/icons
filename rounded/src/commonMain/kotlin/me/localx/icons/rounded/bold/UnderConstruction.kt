package me.localx.icons.rounded.bold

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

public val Icons.Bold.UnderConstruction: ImageVector
    get() {
        if (_underConstruction != null) {
            return _underConstruction!!
        }
        _underConstruction = Builder(name = "UnderConstruction", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.405f, 8.145f)
                lineTo(15.854f, 1.593f)
                curveToRelative(-2.125f, -2.126f, -5.583f, -2.125f, -7.708f, 0.0f)
                lineTo(1.594f, 8.144f)
                curveToRelative(-2.124f, 2.125f, -2.124f, 5.583f, 0.0f, 7.708f)
                lineToRelative(6.551f, 6.552f)
                curveToRelative(1.029f, 1.03f, 2.398f, 1.597f, 3.854f, 1.597f)
                reflectiveCurveToRelative(2.825f, -0.567f, 3.854f, -1.597f)
                lineToRelative(6.551f, -6.552f)
                curveToRelative(2.125f, -2.125f, 2.125f, -5.583f, 0.0f, -7.708f)
                close()
                moveTo(20.284f, 13.731f)
                lineToRelative(-6.552f, 6.552f)
                curveToRelative(-0.925f, 0.926f, -2.54f, 0.926f, -3.466f, 0.0f)
                lineToRelative(-6.55f, -6.552f)
                curveToRelative(-0.956f, -0.956f, -0.956f, -2.51f, 0.0f, -3.466f)
                lineToRelative(6.551f, -6.551f)
                curveToRelative(0.956f, -0.955f, 2.51f, -0.956f, 3.466f, 0.0f)
                lineToRelative(6.551f, 6.552f)
                curveToRelative(0.462f, 0.463f, 0.717f, 1.078f, 0.717f, 1.733f)
                reflectiveCurveToRelative(-0.255f, 1.27f, -0.717f, 1.732f)
                close()
                moveTo(16.0f, 15.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(14.518f, 12.0f)
                horizontalLineToRelative(-5.036f)
                lineToRelative(1.5f, -5.346f)
                curveToRelative(0.199f, -0.436f, 0.609f, -0.654f, 1.018f, -0.654f)
                reflectiveCurveToRelative(0.819f, 0.218f, 1.018f, 0.654f)
                lineToRelative(1.5f, 5.346f)
                close()
            }
        }
        .build()
        return _underConstruction!!
    }

private var _underConstruction: ImageVector? = null
