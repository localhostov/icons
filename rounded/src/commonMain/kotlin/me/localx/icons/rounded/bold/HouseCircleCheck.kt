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

public val Icons.Bold.HouseCircleCheck: ImageVector
    get() {
        if (_houseCircleCheck != null) {
            return _houseCircleCheck!!
        }
        _houseCircleCheck = Builder(name = "HouseCircleCheck", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(21.683f, 17.712f)
                lineToRelative(-2.703f, 2.614f)
                curveToRelative(-0.452f, 0.446f, -1.052f, 0.671f, -1.653f, 0.671f)
                reflectiveCurveToRelative(-1.203f, -0.225f, -1.663f, -0.674f)
                lineToRelative(-1.354f, -1.332f)
                curveToRelative(-0.395f, -0.387f, -0.4f, -1.02f, -0.014f, -1.414f)
                curveToRelative(0.386f, -0.395f, 1.019f, -0.401f, 1.414f, -0.014f)
                lineToRelative(1.354f, 1.331f)
                curveToRelative(0.144f, 0.142f, 0.38f, 0.139f, 0.522f, -0.002f)
                lineToRelative(2.713f, -2.624f)
                curveToRelative(0.397f, -0.381f, 1.031f, -0.37f, 1.414f, 0.029f)
                curveToRelative(0.382f, 0.398f, 0.369f, 1.031f, -0.029f, 1.414f)
                close()
                moveTo(11.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                verticalLineToRelative(-8.614f)
                curveToRelative(0.0f, -1.83f, 0.906f, -3.534f, 2.423f, -4.559f)
                lineTo(8.924f, 0.941f)
                curveToRelative(1.868f, -1.261f, 4.284f, -1.262f, 6.153f, 0.0f)
                lineToRelative(6.923f, 4.707f)
                curveToRelative(1.12f, 0.923f, 1.833f, 2.245f, 1.975f, 3.707f)
                curveToRelative(0.08f, 0.824f, -0.524f, 1.558f, -1.349f, 1.638f)
                curveToRelative(-0.823f, 0.083f, -1.558f, -0.523f, -1.638f, -1.349f)
                curveToRelative(-0.072f, -0.745f, -0.469f, -1.412f, -1.09f, -1.831f)
                lineToRelative(-6.5f, -4.386f)
                curveToRelative(-0.85f, -0.574f, -1.947f, -0.574f, -2.796f, 0.0f)
                lineToRelative(-6.5f, 4.386f)
                curveToRelative(-0.689f, 0.466f, -1.102f, 1.24f, -1.102f, 2.072f)
                verticalLineToRelative(8.614f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _houseCircleCheck!!
    }

private var _houseCircleCheck: ImageVector? = null
