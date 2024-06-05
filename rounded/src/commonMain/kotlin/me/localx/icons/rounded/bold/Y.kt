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

public val Icons.Bold.Y: ImageVector
    get() {
        if (_y != null) {
            return _y!!
        }
        _y = Builder(name = "Y", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.443f, 0.334f)
                curveToRelative(-0.645f, -0.522f, -1.588f, -0.421f, -2.109f, 0.223f)
                lineToRelative(-7.334f, 9.06f)
                lineTo(4.666f, 0.557f)
                curveToRelative(-1.241f, -1.519f, -3.56f, 0.357f, -2.332f, 1.887f)
                lineTo(10.5f, 12.531f)
                verticalLineToRelative(9.969f)
                curveToRelative(0.034f, 1.972f, 2.966f, 1.971f, 3.0f, 0.0f)
                verticalLineTo(12.531f)
                lineTo(21.666f, 2.443f)
                curveToRelative(0.521f, -0.644f, 0.422f, -1.588f, -0.223f, -2.109f)
                close()
            }
        }
        .build()
        return _y!!
    }

private var _y: ImageVector? = null
