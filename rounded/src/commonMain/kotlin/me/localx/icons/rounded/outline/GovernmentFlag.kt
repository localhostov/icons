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

public val Icons.Outline.GovernmentFlag: ImageVector
    get() {
        if (_governmentFlag != null) {
            return _governmentFlag!!
        }
        _governmentFlag = Builder(name = "GovernmentFlag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-8.001f)
                curveToRelative(1.104f, -0.004f, 2.0f, -0.902f, 2.0f, -2.007f)
                curveToRelative(0.0f, -0.736f, -0.402f, -1.412f, -1.047f, -1.762f)
                lineToRelative(-8.604f, -4.693f)
                curveToRelative(-0.112f, -0.061f, -0.233f, -0.093f, -0.35f, -0.137f)
                verticalLineToRelative(-1.02f)
                lineToRelative(2.635f, -1.635f)
                curveToRelative(0.495f, -0.33f, 0.484f, -1.06f, -0.02f, -1.375f)
                lineTo(13.152f, 0.215f)
                curveToRelative(-0.225f, -0.141f, -0.485f, -0.215f, -0.751f, -0.215f)
                curveToRelative(-0.782f, 0.0f, -1.417f, 0.634f, -1.417f, 1.417f)
                verticalLineToRelative(3.583f)
                horizontalLineToRelative(0.015f)
                verticalLineToRelative(0.4f)
                curveToRelative(-0.117f, 0.045f, -0.238f, 0.076f, -0.35f, 0.137f)
                lineTo(2.047f, 10.23f)
                curveToRelative(-0.646f, 0.351f, -1.047f, 1.025f, -1.047f, 1.762f)
                curveToRelative(0.0f, 1.105f, 0.897f, 2.003f, 2.0f, 2.007f)
                verticalLineToRelative(8.001f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(20.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(11.0f, 14.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(17.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(3.004f, 11.986f)
                lineToRelative(8.604f, -4.693f)
                curveToRelative(0.245f, -0.135f, 0.538f, -0.135f, 0.783f, 0.0f)
                lineToRelative(8.601f, 4.707f)
                lineToRelative(-17.99f, -0.013f)
                horizontalLineToRelative(0.002f)
                close()
                moveTo(5.0f, 13.999f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _governmentFlag!!
    }

private var _governmentFlag: ImageVector? = null
