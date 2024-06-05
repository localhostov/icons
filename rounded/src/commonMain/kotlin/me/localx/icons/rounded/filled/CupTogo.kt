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

public val Icons.Filled.CupTogo: ImageVector
    get() {
        if (_cupTogo != null) {
            return _cupTogo!!
        }
        _cupTogo = Builder(name = "CupTogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 4.0f)
                horizontalLineToRelative(-0.492f)
                lineToRelative(-0.172f, -0.82f)
                curveToRelative(-0.388f, -1.853f, -2.022f, -3.18f, -3.915f, -3.18f)
                lineTo(6.58f, 0.0f)
                curveToRelative(-1.893f, 0.0f, -3.527f, 1.327f, -3.915f, 3.18f)
                lineToRelative(-0.172f, 0.82f)
                horizontalLineToRelative(-0.493f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(20.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(2.322f, 8.0f)
                lineToRelative(1.348f, 11.578f)
                curveToRelative(0.293f, 2.521f, 2.429f, 4.422f, 4.966f, 4.422f)
                horizontalLineToRelative(6.728f)
                curveToRelative(2.538f, 0.0f, 4.673f, -1.901f, 4.966f, -4.422f)
                lineToRelative(1.348f, -11.578f)
                lineTo(2.322f, 8.0f)
                close()
                moveTo(6.506f, 17.0f)
                horizontalLineToRelative(10.988f)
                curveToRelative(0.598f, 0.0f, 1.062f, 0.522f, 0.993f, 1.116f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.059f, 0.504f, -0.486f, 0.884f, -0.993f, 0.884f)
                lineTo(6.506f, 19.0f)
                curveToRelative(-0.508f, 0.0f, -0.935f, -0.38f, -0.993f, -0.884f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.069f, -0.594f, 0.395f, -1.116f, 0.993f, -1.116f)
                close()
                moveTo(4.931f, 13.116f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.069f, -0.594f, 0.395f, -1.116f, 0.993f, -1.116f)
                horizontalLineToRelative(12.152f)
                curveToRelative(0.598f, 0.0f, 1.062f, 0.522f, 0.993f, 1.116f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.059f, 0.504f, -0.486f, 0.884f, -0.993f, 0.884f)
                lineTo(5.924f, 14.0f)
                curveToRelative(-0.508f, 0.0f, -0.935f, -0.38f, -0.993f, -0.884f)
                close()
            }
        }
        .build()
        return _cupTogo!!
    }

private var _cupTogo: ImageVector? = null
