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

public val Icons.Filled.CoffinCross: ImageVector
    get() {
        if (_coffinCross != null) {
            return _coffinCross!!
        }
        _coffinCross = Builder(name = "CoffinCross", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.571f, 6.732f)
                lineToRelative(-1.436f, -3.589f)
                curveToRelative(-0.764f, -1.91f, -2.586f, -3.144f, -4.643f, -3.144f)
                horizontalLineToRelative(-5.042f)
                curveToRelative(-2.057f, 0.0f, -3.879f, 1.233f, -4.643f, 3.144f)
                lineToRelative(-1.436f, 3.589f)
                curveToRelative(-0.438f, 1.098f, -0.544f, 2.288f, -0.305f, 3.443f)
                lineToRelative(2.035f, 9.837f)
                curveToRelative(0.478f, 2.311f, 2.537f, 3.987f, 4.896f, 3.987f)
                horizontalLineToRelative(3.944f)
                curveToRelative(2.358f, 0.0f, 4.418f, -1.677f, 4.896f, -3.987f)
                lineToRelative(2.035f, -9.837f)
                curveToRelative(0.238f, -1.157f, 0.133f, -2.348f, -0.305f, -3.443f)
                close()
                moveTo(15.0f, 10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _coffinCross!!
    }

private var _coffinCross: ImageVector? = null
