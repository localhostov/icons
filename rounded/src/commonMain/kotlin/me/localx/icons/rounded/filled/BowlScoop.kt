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

public val Icons.Filled.BowlScoop: ImageVector
    get() {
        if (_bowlScoop != null) {
            return _bowlScoop!!
        }
        _bowlScoop = Builder(name = "BowlScoop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.674f, 13.811f)
                curveToRelative(-0.347f, -0.508f, -0.921f, -0.811f, -1.536f, -0.811f)
                horizontalLineTo(1.862f)
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
                moveTo(2.0f, 11.0f)
                horizontalLineToRelative(20.0f)
                curveToRelative(0.282f, 0.0f, 0.552f, -0.119f, 0.741f, -0.329f)
                curveToRelative(0.189f, -0.209f, 0.282f, -0.489f, 0.254f, -0.771f)
                curveTo(22.432f, 4.256f, 17.704f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(1.568f, 4.256f, 1.005f, 9.9f)
                curveToRelative(-0.028f, 0.281f, 0.064f, 0.562f, 0.254f, 0.771f)
                curveToRelative(0.189f, 0.21f, 0.459f, 0.329f, 0.741f, 0.329f)
                close()
            }
        }
        .build()
        return _bowlScoop!!
    }

private var _bowlScoop: ImageVector? = null
