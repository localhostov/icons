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

public val Icons.Outline.BloodTestTube: ImageVector
    get() {
        if (_bloodTestTube != null) {
            return _bloodTestTube!!
        }
        _bloodTestTube = Builder(name = "BloodTestTube", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.25f, 20.984f)
                curveToRelative(-0.57f, 0.646f, -1.39f, 1.016f, -2.25f, 1.016f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 0.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(17.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                curveToRelative(1.434f, 0.0f, 2.8f, -0.617f, 3.75f, -1.693f)
                curveToRelative(0.365f, -0.414f, 0.326f, -1.046f, -0.088f, -1.412f)
                curveToRelative(-0.415f, -0.365f, -1.045f, -0.326f, -1.412f, 0.088f)
                close()
                moveTo(12.0f, 2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(6.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(20.555f, 11.484f)
                lineToRelative(-1.597f, -1.686f)
                curveToRelative(-1.08f, -1.057f, -2.835f, -1.056f, -3.942f, 0.027f)
                lineToRelative(-1.551f, 1.639f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.122f, 0.0f, 7.071f)
                curveToRelative(0.944f, 0.944f, 2.2f, 1.464f, 3.535f, 1.464f)
                reflectiveCurveToRelative(2.591f, -0.52f, 3.536f, -1.464f)
                curveToRelative(1.949f, -1.95f, 1.949f, -5.122f, 0.019f, -7.052f)
                close()
                moveTo(19.122f, 17.121f)
                curveToRelative(-1.134f, 1.134f, -3.11f, 1.133f, -4.243f, 0.0f)
                curveToRelative(-1.17f, -1.17f, -1.17f, -3.073f, 0.019f, -4.263f)
                lineToRelative(1.543f, -1.631f)
                curveToRelative(0.158f, -0.154f, 0.366f, -0.229f, 0.57f, -0.229f)
                curveToRelative(0.194f, 0.0f, 0.384f, 0.068f, 0.522f, 0.202f)
                lineToRelative(1.589f, 1.678f)
                curveToRelative(1.169f, 1.17f, 1.169f, 3.073f, 0.0f, 4.243f)
                close()
            }
        }
        .build()
        return _bloodTestTube!!
    }

private var _bloodTestTube: ImageVector? = null
