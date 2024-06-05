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

public val Icons.Filled.Choose: ImageVector
    get() {
        if (_choose != null) {
            return _choose!!
        }
        _choose = Builder(name = "Choose", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 8.0f)
                lineTo(0.0f, 8.0f)
                lineTo(0.0f, 0.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(18.0f, 8.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(10.0f, 0.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(13.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(15.0f, 16.462f)
                lineToRelative(9.0f, 3.538f)
                verticalLineToRelative(4.0f)
                lineTo(7.538f, 24.0f)
                lineToRelative(-1.821f, -1.628f)
                curveToRelative(-0.917f, -0.858f, -0.96f, -2.307f, -0.098f, -3.23f)
                curveToRelative(0.861f, -0.922f, 2.313f, -0.97f, 3.235f, -0.109f)
                curveToRelative(0.034f, 0.032f, 1.069f, 0.898f, 2.145f, 1.784f)
                verticalLineToRelative(-8.817f)
                curveToRelative(0.0f, -1.215f, 1.083f, -2.176f, 2.336f, -1.973f)
                curveToRelative(0.983f, 0.16f, 1.664f, 1.083f, 1.664f, 2.08f)
                verticalLineToRelative(4.355f)
                close()
                moveTo(4.158f, 17.777f)
                curveToRelative(1.017f, -1.088f, 2.472f, -1.527f, 3.842f, -1.299f)
                verticalLineToRelative(-6.477f)
                lineTo(0.0f, 10.001f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.963f)
                curveToRelative(0.062f, -0.076f, 0.127f, -0.151f, 0.195f, -0.224f)
                close()
            }
        }
        .build()
        return _choose!!
    }

private var _choose: ImageVector? = null
