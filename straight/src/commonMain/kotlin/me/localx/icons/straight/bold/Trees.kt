package me.localx.icons.straight.bold

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

public val Icons.Bold.Trees: ImageVector
    get() {
        if (_trees != null) {
            return _trees!!
        }
        _trees = Builder(name = "Trees", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.103f, 22.0f)
                lineToRelative(-3.477f, -6.0f)
                horizontalLineToRelative(2.444f)
                lineToRelative(-3.957f, -6.0f)
                horizontalLineToRelative(2.1f)
                lineTo(16.001f, 1.184f)
                curveToRelative(-0.592f, -0.752f, -1.503f, -1.184f, -2.501f, -1.184f)
                curveToRelative(-0.765f, 0.0f, -1.479f, 0.254f, -2.037f, 0.711f)
                curveToRelative(-0.525f, -0.453f, -1.202f, -0.711f, -1.91f, -0.711f)
                curveToRelative(-0.956f, 0.0f, -1.854f, 0.469f, -2.4f, 1.253f)
                lineTo(2.579f, 10.0f)
                horizontalLineToRelative(1.862f)
                lineToRelative(-3.5f, 6.0f)
                horizontalLineToRelative(2.157f)
                lineTo(0.023f, 22.0f)
                horizontalLineToRelative(7.977f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.103f)
                close()
                moveTo(13.619f, 3.023f)
                lineToRelative(2.344f, 3.977f)
                horizontalLineToRelative(-2.422f)
                lineToRelative(3.957f, 6.0f)
                horizontalLineToRelative(-2.077f)
                lineToRelative(3.477f, 6.0f)
                horizontalLineToRelative(-10.794f)
                lineToRelative(3.477f, -6.0f)
                horizontalLineToRelative(-2.078f)
                lineToRelative(3.958f, -6.0f)
                horizontalLineToRelative(-2.423f)
                lineToRelative(2.344f, -3.977f)
                curveToRelative(0.049f, -0.021f, 0.189f, -0.021f, 0.238f, 0.0f)
                close()
            }
        }
        .build()
        return _trees!!
    }

private var _trees: ImageVector? = null
