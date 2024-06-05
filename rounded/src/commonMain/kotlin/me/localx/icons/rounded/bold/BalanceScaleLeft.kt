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

public val Icons.Bold.BalanceScaleLeft: ImageVector
    get() {
        if (_balanceScaleLeft != null) {
            return _balanceScaleLeft!!
        }
        _balanceScaleLeft = Builder(name = "BalanceScaleLeft", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 11.5f)
                curveToRelative(0.22f, 6.231f, 9.399f, 5.774f, 8.943f, -0.408f)
                lineToRelative(-2.526f, -8.939f)
                curveToRelative(-0.45f, -1.502f, -1.948f, -2.403f, -3.514f, -2.089f)
                lineToRelative(-4.482f, 0.981f)
                curveToRelative(-0.48f, -1.6f, -2.941f, -1.235f, -2.922f, 0.455f)
                verticalLineToRelative(0.185f)
                lineToRelative(-4.527f, 0.991f)
                curveToRelative(-1.635f, 0.327f, -2.949f, 1.522f, -3.428f, 3.119f)
                lineTo(0.063f, 14.069f)
                curveToRelative(-0.396f, 2.599f, 1.85f, 4.953f, 4.436f, 4.931f)
                curveToRelative(2.589f, 0.024f, 4.853f, -2.35f, 4.43f, -4.952f)
                lineTo(6.294f, 5.7f)
                curveToRelative(0.093f, -0.038f, 0.191f, -0.068f, 0.294f, -0.088f)
                lineToRelative(3.912f, -0.858f)
                lineTo(10.5f, 21.0f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.972f, 0.033f, -1.971f, 2.967f, 0.0f, 3.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.972f, -0.033f, 1.971f, -2.967f, 0.0f, -3.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(13.5f, 4.097f)
                lineToRelative(3.922f, -0.86f)
                lineToRelative(-2.358f, 7.831f)
                curveToRelative(-0.042f, 0.14f, -0.063f, 0.286f, -0.063f, 0.433f)
                close()
                moveTo(4.459f, 9.854f)
                lineToRelative(1.31f, 4.146f)
                lineTo(3.216f, 14.0f)
                lineToRelative(1.243f, -4.146f)
                close()
                moveTo(19.549f, 6.575f)
                lineToRelative(1.25f, 4.425f)
                horizontalLineToRelative(-2.583f)
                lineToRelative(1.333f, -4.425f)
                close()
            }
        }
        .build()
        return _balanceScaleLeft!!
    }

private var _balanceScaleLeft: ImageVector? = null
