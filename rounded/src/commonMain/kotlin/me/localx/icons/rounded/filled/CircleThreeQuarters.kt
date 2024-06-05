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
                moveTo(11.98f, 24.0f)
                curveToRelative(-0.44f, 0.0f, -0.89f, -0.02f, -1.34f, -0.07f)
                curveTo(5.13f, 23.32f, 0.68f, 18.87f, 0.08f, 13.36f)
                curveTo(-0.61f, 7.2f, 3.5f, 1.36f, 9.43f, 0.07f)
                curveToRelative(0.86f, -0.19f, 1.75f, 0.03f, 2.44f, 0.58f)
                curveToRelative(0.72f, 0.58f, 1.13f, 1.44f, 1.13f, 2.36f)
                verticalLineToRelative(7.99f)
                horizontalLineToRelative(7.99f)
                curveToRelative(0.92f, 0.0f, 1.78f, 0.41f, 2.36f, 1.13f)
                curveToRelative(0.56f, 0.69f, 0.77f, 1.58f, 0.58f, 2.44f)
                curveToRelative(-1.2f, 5.49f, -6.31f, 9.43f, -11.96f, 9.43f)
                close()
            }
        }
        .build()
        return _circleThreeQuarters!!
    }

private var _circleThreeQuarters: ImageVector? = null
