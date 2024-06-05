package me.localx.icons.straight.outline

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

public val Icons.Outline.ArrowUpLeftFromCircle: ImageVector
    get() {
        if (_arrowUpLeftFromCircle != null) {
            return _arrowUpLeftFromCircle!!
        }
        _arrowUpLeftFromCircle = Builder(name = "ArrowUpLeftFromCircle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.414f)
                verticalLineToRelative(6.586f)
                lineTo(0.0f, 10.0f)
                lineTo(0.0f, 2.0f)
                curveTo(0.0f, 0.897f, 0.897f, 0.0f, 2.0f, 0.0f)
                lineTo(10.0f, 0.0f)
                lineTo(10.0f, 2.0f)
                lineTo(3.414f, 2.0f)
                lineToRelative(12.793f, 12.793f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(2.0f, 3.414f)
                close()
                moveTo(14.0f, 4.0f)
                curveToRelative(-1.666f, 0.0f, -3.235f, 0.415f, -4.618f, 1.139f)
                lineToRelative(1.496f, 1.496f)
                curveToRelative(0.96f, -0.409f, 2.015f, -0.635f, 3.122f, -0.635f)
                curveToRelative(4.411f, 0.0f, 8.0f, 3.589f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.589f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.589f, -8.0f, -8.0f)
                curveToRelative(0.0f, -1.107f, 0.227f, -2.162f, 0.635f, -3.122f)
                lineToRelative(-1.496f, -1.496f)
                curveToRelative(-0.724f, 1.383f, -1.139f, 2.952f, -1.139f, 4.618f)
                curveToRelative(0.0f, 5.514f, 4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(19.514f, 4.0f, 14.0f, 4.0f)
                close()
            }
        }
        .build()
        return _arrowUpLeftFromCircle!!
    }

private var _arrowUpLeftFromCircle: ImageVector? = null
