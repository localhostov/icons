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

public val Icons.Bold.ArrowUpLeftFromCircle: ImageVector
    get() {
        if (_arrowUpLeftFromCircle != null) {
            return _arrowUpLeftFromCircle!!
        }
        _arrowUpLeftFromCircle = Builder(name = "ArrowUpLeftFromCircle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.121f)
                verticalLineToRelative(3.379f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.379f)
                lineTo(15.561f, 13.439f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineTo(3.0f, 5.121f)
                close()
                moveTo(14.0f, 4.0f)
                curveToRelative(-0.59f, 0.0f, -1.183f, 0.052f, -1.762f, 0.155f)
                curveToRelative(-0.815f, 0.145f, -1.359f, 0.923f, -1.215f, 1.739f)
                curveToRelative(0.146f, 0.816f, 0.927f, 1.359f, 1.739f, 1.215f)
                curveToRelative(0.407f, -0.072f, 0.823f, -0.109f, 1.238f, -0.109f)
                curveToRelative(3.859f, 0.0f, 7.0f, 3.14f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.141f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.14f, -7.0f, -7.0f)
                curveToRelative(0.0f, -0.415f, 0.037f, -0.832f, 0.109f, -1.238f)
                curveToRelative(0.145f, -0.816f, -0.399f, -1.594f, -1.215f, -1.739f)
                curveToRelative(-0.812f, -0.143f, -1.594f, 0.399f, -1.739f, 1.215f)
                curveToRelative(-0.103f, 0.579f, -0.155f, 1.172f, -0.155f, 1.762f)
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
