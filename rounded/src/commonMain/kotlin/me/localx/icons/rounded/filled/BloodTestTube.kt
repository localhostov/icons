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

public val Icons.Filled.BloodTestTube: ImageVector
    get() {
        if (_bloodTestTube != null) {
            return _bloodTestTube!!
        }
        _bloodTestTube = Builder(name = "BloodTestTube", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 20.0f)
                curveToRelative(-1.335f, 0.0f, -2.591f, -0.52f, -3.535f, -1.464f)
                curveToRelative(-1.95f, -1.95f, -1.95f, -5.122f, 0.0f, -7.071f)
                lineToRelative(1.551f, -1.639f)
                lineToRelative(0.55f, -0.565f)
                curveToRelative(0.785f, -0.807f, 2.08f, -0.808f, 2.866f, -0.002f)
                lineToRelative(0.527f, 0.54f)
                lineToRelative(1.597f, 1.686f)
                curveToRelative(1.93f, 1.93f, 1.93f, 5.102f, -0.019f, 7.052f)
                curveToRelative(-0.945f, 0.944f, -2.201f, 1.464f, -3.536f, 1.464f)
                close()
                moveTo(3.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(10.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 0.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(12.051f, 19.95f)
                curveToRelative(-2.729f, -2.729f, -2.729f, -7.17f, 0.0f, -9.899f)
                lineToRelative(0.993f, -1.05f)
                lineTo(4.0f, 9.001f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                curveToRelative(2.014f, 0.0f, 3.743f, -1.203f, 4.534f, -2.923f)
                curveToRelative(-0.535f, -0.306f, -1.036f, -0.68f, -1.483f, -1.128f)
                close()
            }
        }
        .build()
        return _bloodTestTube!!
    }

private var _bloodTestTube: ImageVector? = null
