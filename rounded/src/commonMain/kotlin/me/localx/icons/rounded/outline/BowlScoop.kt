package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.BowlScoop: ImageVector
    get() {
        if (_bowlScoop != null) {
            return _bowlScoop!!
        }
        _bowlScoop = Builder(name = "BowlScoop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.9f, 10.995f)
                curveToRelative(0.557f, 0.051f, 1.04f, -0.346f, 1.095f, -0.896f)
                curveTo(3.456f, 5.482f, 7.327f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(8.544f, 3.482f, 9.005f, 8.1f)
                curveToRelative(0.052f, 0.516f, 0.562f, 1.006f, 1.095f, 0.896f)
                curveToRelative(0.55f, -0.055f, 0.95f, -0.545f, 0.896f, -1.095f)
                curveTo(22.432f, 4.256f, 17.704f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(1.568f, 4.256f, 1.005f, 9.9f)
                curveToRelative(-0.055f, 0.55f, 0.346f, 1.04f, 0.896f, 1.095f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.674f, 13.811f)
                curveToRelative(-0.347f, -0.508f, -0.921f, -0.811f, -1.536f, -0.811f)
                lineTo(1.862f, 13.0f)
                curveToRelative(-0.615f, 0.0f, -1.189f, 0.303f, -1.536f, 0.811f)
                curveToRelative(-0.348f, 0.508f, -0.422f, 1.153f, -0.198f, 1.726f)
                curveToRelative(0.0f, 0.0f, 0.169f, 0.423f, 0.198f, 0.472f)
                curveToRelative(1.622f, 2.706f, 3.927f, 2.964f, 5.973f, 2.992f)
                horizontalLineToRelative(4.701f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.715f)
                curveToRelative(2.032f, -0.028f, 4.337f, -0.286f, 5.959f, -2.992f)
                curveToRelative(0.029f, -0.049f, 0.198f, -0.472f, 0.198f, -0.472f)
                curveToRelative(0.224f, -0.572f, 0.149f, -1.218f, -0.198f, -1.726f)
                close()
                moveTo(21.916f, 15.049f)
                curveToRelative(-0.994f, 1.611f, -2.211f, 1.923f, -4.215f, 1.951f)
                lineTo(6.312f, 17.0f)
                curveToRelative(-2.018f, -0.028f, -3.234f, -0.34f, -4.229f, -1.951f)
                lineToRelative(-0.02f, -0.049f)
                horizontalLineToRelative(19.871f)
                lineToRelative(-0.02f, 0.049f)
                close()
            }
        }
        .build()
        return _bowlScoop!!
    }

private var _bowlScoop: ImageVector? = null
