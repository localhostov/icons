package me.localx.icons.straight.filled

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

public val Icons.Filled.CircleThreeQuarters: ImageVector
    get() {
        if (_circleThreeQuarters != null) {
            return _circleThreeQuarters!!
        }
        _circleThreeQuarters = Builder(name = "CircleThreeQuarters", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.38f, 24.0f, 0.0f, 18.62f, 0.0f, 12.0f)
                reflectiveCurveTo(5.38f, 0.0f, 12.0f, 0.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 6.62f, -5.38f, 12.0f, -12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _circleThreeQuarters!!
    }

private var _circleThreeQuarters: ImageVector? = null
